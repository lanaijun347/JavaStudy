package zsq.study.polymorphism01;

public class Animal {

    private String color;
    private int age;

    static {
        System.out.println("静态代码块， 随着类的加载而加载，只执行一次，通常用于数据初始化。");
    }

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

    public void ect(String something) {
        System.out.println("动物在吃" + something);
    }
}
