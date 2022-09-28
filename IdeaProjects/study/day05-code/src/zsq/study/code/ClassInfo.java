package zsq.study.code;

public class ClassInfo {
    public static void main(String[] args) {
        // 类有：javabean类、测试类、工具类
        // 测试类: 用于检查其他类是否书写争取，带有main方法的类。该类就是测试类 - 程序入口
        // javaBean类： 用来描述一类事物的类。比如人、狗、猫等 --> ClassJavaBean 就是一个简单的JavaBean类
        // 工具类：不是用来描述事物的，而是用来帮我们做一些事情的类。 ---> ClassTool 就是一个简单的工具类

        // 使用 static 定义的成员变量， 该值改变后，原来的值也会跟着改变，例如：罗翔 会变成 阿伟
        ClassJavaBean cjb1 = new ClassJavaBean("罗翔", "张三", 12, "男");
        ClassJavaBean cjb2 = new ClassJavaBean("阿伟", "李四", 13, "女");

        System.out.println(cjb1);
        System.out.println(cjb2);

        // 测试工具类
        int number1 = 10;
        int number2 = 5;

        int max = ClassTool.getMax(number1, number2);
        System.out.println(max);

        int number = -2;
        int abs = ClassTool.getAbs(number);
        System.out.println(abs);

        int min = ClassTool.getMin(number1, number2);
        System.out.println(min);
    }
}
