package code;

import java.util.Scanner;

public class Day04Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是否是会员 0表示不是 1表示是：");
        int flag = sc.nextInt();
        System.out.println("请输入购物金额：");
        double money = sc.nextDouble();
        if (0 == flag) {
            if (money < 100) {
                System.out.println(money);
            } else {
                System.out.println(money * 0.9);
            }

        } else {
            if (money < 200) {
                System.out.println(money * 0.8);
            } else {
                System.out.println(money * 0.75);
            }
        }
    }
}
