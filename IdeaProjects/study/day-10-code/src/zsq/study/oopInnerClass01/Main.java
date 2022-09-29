package zsq.study.oopInnerClass01;

public class Main {
    public static void main(String[] args) {

        // 匿名内部类：本质就是隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置。
        // 格式： new 类名/接口名() { 重写方法 };     --> 继承/实现、方法重写、创建对象


        // 编写匿名内部类的代码
        // 包含了实现Swim关系、方法的重写、创建对象
        // 整体就是一个类的子类的对象或者接口的现实对象
        // 创建了一个匿名内部类对象实现了Swim
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了Swim接口游泳的方法");
            }
        };

        // 包含了继承Animal关系、方法的重写、创建对象
        // 创建了一个匿名内部类对象继承了Animal
        new Animal() {
            @Override
            public void ect() {
                System.out.println("重写了Animal抽象类的方法");
            }
        };


        // 在测试类中调用method方法
        // 以前：1.要自己创建一个子类继承Animal类，再创建子类对象，传递给method方法
        Dog dog = new Dog();
        method(dog);

        // 匿名内部类：
        // 如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦，所有使用匿名内部类
        method(
                new Animal() {
                    @Override
                    public void ect() {
                        System.out.println("匿名内部类的狗吃骨头");
                    }
                }
        );
        // 调用匿名类继承Anima 的 ect 方法
        new Animal() {
            @Override
            public void ect() {
                System.out.println("调用匿名类继承Anima 的 ect 方法");
            }
        }.ect();

        // 整体我们可以理解为Swim接口的实现对象
        // 接口的多态
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("Swim接口的实现对象，接口的多态");
            }
        };
        s.swim();
    }


    // Animal a = 子对象 （这就是多态嘛）
    public static void method(Animal a){
        a.ect();
    }
}
