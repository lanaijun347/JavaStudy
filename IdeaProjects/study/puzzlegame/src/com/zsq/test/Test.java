package com.zsq.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 创建一个长度15的一维数组，并赋值
        int[] tempArr = new int[16];
        for (int i = 0; i < 16; i++) {
            tempArr[i] = i;
        }
        for (int j : tempArr) {
            System.out.print(j + " ");
        }
        System.out.println();
        // 把一维数组的下标值随机交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        // 打印随机交换后的一维数组
        for (int j : tempArr) {
            System.out.print(j + " ");
        }
        System.out.println();

        // 用一维数组给二维数组赋值
        int[][] data = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
        // 打印二维数组
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
