package zsq.study.polymorphism;

public class Main {
    public static void main(String[] args) {

        // 多态的测试01
        // 多态就是对象的多种形态
        // 多态前提：有继承/实现关系、有父类引用指向子类的关系、有方法的重写
        // 多态好处：使父类型作为参数，可接收所有子类对象，体现多态的扩展性和便利。

        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        Teacher teacher = new Teacher();
        teacher.setName("罗翔");
        teacher.setAge(39);
        Administrator administrator = new Administrator();
        administrator.setName("347");
        administrator.setAge(18);
        Student student1 = new Student("李四", 17);

        register(student);
        register(student1);
        register(teacher);
        register(administrator);
    }

    // 这个方法既能接收老师又能接收学生又能接收管理员
    // 只能把参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
