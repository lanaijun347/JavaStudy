package zsq.study.polymorphism01;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void ect(String something){
        System.out.println(getAge() + "岁的" + getColor() + "的狗在吃" + something);
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
