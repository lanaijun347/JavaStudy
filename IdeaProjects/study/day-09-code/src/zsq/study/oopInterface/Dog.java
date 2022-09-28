package zsq.study.oopInterface;

public class Dog extends Animal implements Swim{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void ect() {
        System.out.println("二哈在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("修狗在狗刨");
    }
}
