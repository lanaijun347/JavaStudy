package zsq.study.oopInterface;

public class Frog extends Animal implements Swim{
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void ect() {
        System.out.println("呱在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("呱在游泳");
    }
}
