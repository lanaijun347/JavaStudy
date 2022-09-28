package zsq.study.polymorphism01;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void ect(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫在吃" + something);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

    public void action(String act){
        System.out.println(getAge() + "岁的" + getColor() + "猫" + act + "你");
    }
}
