package zsq.study.oopAbstract;

public  class Student extends Person{

    public Student() {

    }

    public Student(String name, int age) {
        super(name, age);
    }

    // 抽象类的子类：要么重写抽象类的所有抽象方法，要么本身也是一个抽象类
    @Override
    public void work() {
        System.out.println("学习");
    }
}
