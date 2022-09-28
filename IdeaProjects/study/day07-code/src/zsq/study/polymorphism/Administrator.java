package zsq.study.polymorphism;

public class Administrator extends Person{

    @Override
    public void show() {
        System.out.printf("管理员信息为：%s\t%s\n", getName(), getAge());
    }
}
