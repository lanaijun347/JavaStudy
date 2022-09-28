package zsq.study.demo1;
// 导包
import java.util.Scanner;

public class ScannerNumAdd {
    public static void main(String[] args){
        // 创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        //接收数据
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println(number1 + number2);
        //输入（首字母） psvm + tab 或 main + tab 就能快速生成 public static void main(String[] args)
        //输入 sout + tab 就能快速生成 System.out.println();
    }
}
