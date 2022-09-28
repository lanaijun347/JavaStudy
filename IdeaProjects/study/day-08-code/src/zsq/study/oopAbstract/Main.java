package zsq.study.oopAbstract;

public class Main {
    public static void main(String[] args) {

        // Person 是一个抽象类不能创建对象
        // Person p = new Person();

        Student student = new Student("张三", 18);
        student.work();
        Teacher teacher = new Teacher("罗翔", 28);
        teacher.work();
    }
}
