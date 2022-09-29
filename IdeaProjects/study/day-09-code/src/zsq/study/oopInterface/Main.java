package zsq.study.oopInterface;

public class Main {
    public static void main(String[] args) {

        // interface 接口 关键字 例如：public interface 接口名{}
        // 接口不能实例化，即不能创建对象
        // 接口和类之间是实现关系，通过 implement 关键字表示 例如： public class 类名 implement 接口名 {}
        // 接口的子类：要么重写接口中的所有抽方法，要么是 抽象类

        // 注意1：接口和类的实现关系，可以单实现，也可以多实现
        //      public class 类名 implement 接口名1, 接口名2 {}
        // 注意2：实现类还可以在继承一个类的同时实现多个接口。
        //      public class 类名 extends 父类 implement 接口1, 接口2{}
        // 接口跟接口的关系：继承关系，可以单继承，也可以多继承 例如 extends 接口1, 接口2
        // 继承条件：实现的子类需重写父类这个体系中的所有方法

        // 接口成员变量：只能是常量，默认修饰符 public static final 类型 常量名
        // 接口是没有构造方法的
        // JDK7以前成员方法只能是抽象方法，默认修饰符 public abstract 类型 方法名();
        // JDK8 可以定义有方法体的方法
        // JDK9 可以定义私有方法

        /*
        * 青蛙：名字， 年龄  吃虫子，蛙泳
        * 狗  ：名字， 年龄  吃骨头，狗刨
        * 兔子：名字， 年龄  吃胡萝卜
        * */

        Frog frog = new Frog("呱", 2);
        frog.ect();
        frog.swim();
        Dog dog = new Dog("二哈", 3);
        dog.ect();
        dog.swim();
        Rabbit rabbit = new Rabbit("兔兔", 1);
        rabbit.ect();

    }
}
