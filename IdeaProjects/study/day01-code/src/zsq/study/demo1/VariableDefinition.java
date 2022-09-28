package zsq.study.demo1;

public class VariableDefinition {
    public static void main(String[] args) {
        //目标：需要大家掌握常见的数据在代码中如何书写的？

        //整数
        System.out.println(666);
        System.out.println(-777);

        //小数
        System.out.println(1.93);
        System.out.println(-3.71);

        //字符串
        System.out.println("黑马程序员");
        System.out.println("尼古拉斯阿玮");

        //字符
        System.out.println('男');
        System.out.println('女');

        //布尔
        boolean bool = true;
        System.out.println(true);
        System.out.println(false);

        //空
        //细节：null不能直接打印的。
        //如果我们要打印null，那么只能用字符串的形式进行打印
        System.out.println("null");

        int a = 0x7fffffff;
        int b = 0xffffffff;
        System.out.println(a);
        System.out.println(b);

        //八进制
        System.out.println(017);
        //二进制
        System.out.println(0b0110);

        //long的定义，通常需要在数据较长时末尾加 l 或 L
        long c = 0x7fffffffffffffffL;
        System.out.println(c);

        //float 类型定义数据后面需加 f 或 F
        float d = 5.5F;
        System.out.println(d);

        double e = 20.2;
        System.out.println(e);

        //强转
        int f = (int)'a';
        System.out.println(f);

        //字符串
        String q = "吃了吗？";
        System.out.println(q);

        String j = new String("MUN");
        System.out.println(j);

        //输出字符串第n个字节
        System.out.println(q.charAt(0));
        //字符串截取
        System.out.println(q.substring(0, 2));

        //字符串转成数组
        char[] ch = j.toCharArray();
        System.out.println(ch[1]);

        // 数据丢失
        int p = 128;
        byte i = (byte)p;
        System.out.println(i);

        // 字符串相加
        String str = "3333";
        int p1 = 222;
        int p2 = 1;
        System.out.println(str + p1); //输出 3333222
        System.out.println(p1 + p2 + str); //输出 2233333

        System.out.println((int)'a');//97
        System.out.println('a' + 1);//98
        System.out.println((char)('a' + 1));//b

    }
}
