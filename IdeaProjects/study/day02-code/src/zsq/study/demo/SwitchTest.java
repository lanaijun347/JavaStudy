package zsq.study.demo;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put in:");
        int number = sc.nextInt();
		
        // �� switch д����ʡ�� break��ǰ���� Jdk �汾��12���ϡ�
        switch (number){
            case 1 -> {
                System.out.println("����Ϊһ");
            }
            case 2 -> {
                System.out.println("����Ϊ��");
            }
            case 3 -> {
                System.out.println("����Ϊ��");
            }
            default -> {
                System.out.println("���벻���ڶ�Ӧֵ��");
            }
        }

        System.out.println("put in:");
        int number2 = sc.nextInt();
        // case ����ֻ��һ�д���ʱ ��дΪ
        switch (number2){
            case 1 -> System.out.println("����Ϊһ");
            case 2 -> System.out.println("����Ϊ��");
            case 3 -> System.out.println("����Ϊ��");
            default -> System.out.println("���벻���ڶ�Ӧֵ��");
        }

        System.out.println("put in:");
        int number3 = sc.nextInt();
        switch (number3){
            case 1, 2, 3, 4, 5 -> System.out.println("������");
            case 6, 7-> System.out.println("��Ϣ��");
            default -> System.out.println("û������2" + number3);
        }
    }
}
