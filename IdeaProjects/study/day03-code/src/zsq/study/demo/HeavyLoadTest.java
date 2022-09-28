package zsq.study.demo;

// 重载的测试
// 重载是在同一个类里面，函数名称相同，参数不同（类型不同、个数不同、顺序不同）
// 重载即：同名不同参
public class HeavyLoadTest {
    public static void main(String[] args) {

        // 调用参数 int 类型的函数
        sum(2, 3);
        // 调用参数 byte 类型的函数
        sum((byte) 1, (byte) 1);
        // 调用参数 int 类型，个数为3的函数
        sum(1, 2, 3);
    }

    public static void sum(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

    public static void sum(short s1, short s2) {
        System.out.println(s1 == s2);
    }

    public static void sum(int i1, int i2) {
        System.out.println(i1 == i2);
    }

    public static void sum(long n1, long n2) {
        System.out.println(n1 == n2);
    }

    public static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    public static void sum(double b1, int b2) {
        System.out.println(b1 + b2);
    }

    public static void sum(int b1, double b2) {
        System.out.println(b1 + b2);
    }
}
