package code;

import java.util.Scanner;

public class Day04Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("put in:");
        int b = sc.nextInt();
        System.out.println("put in:");
        int c = sc.nextInt();

        a = a > b ? a : b;
        a = Math.max(a, c);
        System.out.println(a);
    }
}
