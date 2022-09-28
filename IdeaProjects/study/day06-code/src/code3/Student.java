package code3;

public class Student extends Person{
    String sex;
    public Student() {
        // this() 表示调用本类的其他构造，给 sex 赋一个默认值 男
        this(null, "男");
        System.out.println("子类的无参构造");
    }

    public Student(String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public Student(String name, int age, String sex) {
        super(name, age);
        this.sex = sex;
    }
}
