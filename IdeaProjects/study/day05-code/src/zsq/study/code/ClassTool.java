package zsq.study.code;

public class ClassTool {
    // 工具类，类名一般取名为具体的工具名，如 Math 表示一个数学类， ArrUtil 表示一个数字工具类
    // 工具类私有构造方法，防止外界创建该类对象，创建一个工具类对象没有意义，只是用类的方法
    // 工具类的方法都定义成静态的，方便调用

    private ClassTool() {
    }

    // 静态方法中只能访问静态
    // 非静态方法中可以访问所有
    // 静态方法中没有 this 关键字
    public static int getMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    public static int getMin(int number1, int number2) {
        return Math.min(number1, number2);
    }

    public static int getAbs(int number) {
        return Math.abs(number);
    }
}
