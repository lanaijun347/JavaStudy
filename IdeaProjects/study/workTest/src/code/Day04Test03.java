package code;

import java.util.Scanner;

public class Day04Test03 {
    public static void main(String[] args) {
        double[] interest = {2.25, 2.7, 3.25, 3.6};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入的了几年：");
        int year = sc.nextInt();
        double money = 1000;
        for (int i = 0; i < year; i++) {
            money += money * interest[i] / 100;
        }
        System.out.println(money);
    }
}
