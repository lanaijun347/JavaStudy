package code3;

public class Main {
    public static void main(String[] args) {
        // 子类构造函方法会默认调用父类的无参构造方法super()，不写时会自动隐藏
        // 想调用父类有参构造，需在子类构造方法第一行写入 父类有参构造 例如：Student student1 = new Student("张三", 18);
        Student student = new Student();
        System.out.println(student.name + ' ' + student.age + ' ' + student.sex);
        Student student1 = new Student("张三", 18, "男");
        System.out.println(student1.name + ' ' + student1.age + ' ' + student1.sex);
    }
}
