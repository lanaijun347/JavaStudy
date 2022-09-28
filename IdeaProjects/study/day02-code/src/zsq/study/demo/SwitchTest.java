package zsq.study.demo;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put in:");
        int number = sc.nextInt();
		
        // 该 switch 写法可省略 break，前提是 Jdk 版本在12以上。
        switch (number){
            case 1 -> {
                System.out.println("输入为一");
            }
            case 2 -> {
                System.out.println("输入为二");
            }
            case 3 -> {
                System.out.println("输入为三");
            }
            default -> {
                System.out.println("输入不存在对应值。");
            }
        }

        System.out.println("put in:");
        int number2 = sc.nextInt();
        // case 后面只有一行代码时 可写为
        switch (number2){
            case 1 -> System.out.println("输入为一");
            case 2 -> System.out.println("输入为二");
            case 3 -> System.out.println("输入为三");
            default -> System.out.println("输入不存在对应值。");
        }

        System.out.println("put in:");
        int number3 = sc.nextInt();
        switch (number3){
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7-> System.out.println("休息日");
            default -> System.out.println("没有星期2" + number3);
        }
    }
}
