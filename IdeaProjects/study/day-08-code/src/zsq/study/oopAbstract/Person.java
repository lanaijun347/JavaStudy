package zsq.study.oopAbstract;

public abstract class Person {

    // abstract 用来修饰抽象类、抽象方法
    // 抽象类不能实例化 即不能创建对象
    // 抽象类中不一定有抽象方法，有抽象方法的类一定是 抽象类
    // 抽象类可以有构造方法；作用：当创建子类对象时，给属性赋值的。
    // 抽象类的子类：要么重写抽象类的所有抽象方法，要么本身也是一个抽象类

    private String name;
    private int age;

    // 作用：当创建子类对象时，给属性赋值的。
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 抽象方法没有方法体 即 没有 {}
    public abstract void work();

    // 抽象类中不一定有抽象方法，有抽象方法的类一定是 抽象类
    public void sleep(){
        System.out.println("睡觉");
    }
}
