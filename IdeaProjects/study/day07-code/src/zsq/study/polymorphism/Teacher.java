package zsq.study.polymorphism;

public class Teacher extends Person{

    @Override
    public void show() {
        System.out.printf("老师的信息为：%s\t%s\n", getName(), getAge());
    }
}
