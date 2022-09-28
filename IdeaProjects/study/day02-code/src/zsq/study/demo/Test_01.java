package zsq.study.demo;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int number2 = sc.nextInt();

        // 其中一个数字为6 或合为6的倍数 输出 true 其他输出 false
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);

    }
}
