package zsq.study.polymorphism;

public class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.printf("学生信息为：%s\t%s\n", getName(), getAge());
    }
}
