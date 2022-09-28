package zsq.study.demo;
// 输入一个正整数，按 个、十、百、千...等输出
import java.util.Scanner;

public class SplitNumber {
    public static void main(String[] args) {

        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 10) {
            while (number >= 10) {
                System.out.println(number % 10);
                number = number / 10;
            }
        }
        System.out.println(number);
    }
}
