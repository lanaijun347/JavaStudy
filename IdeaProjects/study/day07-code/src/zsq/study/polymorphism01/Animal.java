package zsq.study.polymorphism01;

public class Animal {

    private String color;
    private int age;

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ect(String something){
        System.out.println("动物在吃" + something);
    }
}
