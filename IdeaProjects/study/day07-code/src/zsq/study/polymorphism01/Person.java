package zsq.study.polymorphism01;

public class Person {
    private String name;
    private int age;

    {
        // 写在成员位置的代码块
        // 作用：可以把多个构造方法中重复的代码抽取出来
        // 构造代码块优先于构造方法先执行
        System.out.println("构造代码块执行了");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something){
        // instanceof 判断 是否是该类型， 是就把 a 强转为 Dog 类型 赋值给 dog
        if(a instanceof Dog dog)
        {
            System.out.println(getAge() + "的" + getName() + "养了一只" + dog.getAge() + "岁" + a.getColor() + "狗");
            dog.ect(something);
            dog.lookHome();
        }
        else if(a instanceof Cat cat){
            System.out.println(getAge() + "的" + getName() + "养了一只" + a.getAge() + "岁" + cat.getColor() + "猫");
            cat.ect(something);
            cat.catchMouse();
            cat.action("蹭蹭");
        }
        else {
            System.out.println("没有该物种");
        }

    }
}
