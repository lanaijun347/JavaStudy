package zsq.study.oopInterface;

public class Rabbit extends Animal{

    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }

    @Override
    public void ect() {
        System.out.println("兔子吃胡萝卜");
    }
}
