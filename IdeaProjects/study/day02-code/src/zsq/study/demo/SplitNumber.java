package zsq.study.demo;
// ����һ������������ ����ʮ���١�ǧ...�����
import java.util.Scanner;

public class SplitNumber {
    public static void main(String[] args) {

        System.out.println("������һ����������");
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
