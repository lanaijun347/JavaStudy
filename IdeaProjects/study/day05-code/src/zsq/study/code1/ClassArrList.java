package zsq.study.code1;

import java.util.ArrayList;

public class ClassArrList {
    public static void main(String[] args) {
        // 创建一个int型的集合（C++叫容器）
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        // 创建一个char型的集合
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('b');
        // 创建一个double型的集合
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        //创建一个Student集合
        ArrayList<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("张三", 15, "男");
        Student stu2 = new Student("李四", 18, "女");
        stuList.add(stu1);
        stuList.add(stu2);

        System.out.println(intList);
        System.out.println(charList);
        System.out.println(doubleList);
        System.out.println(stuList.get(0).getName() + stuList.get(0).getAge() + stuList.get(0).getSex());
        System.out.printf("姓名：%s  年龄：%s  性别：%S", stuList.get(1).getName(), stuList.get(1).getAge(), stuList.get(1).getSex());
    }
}
