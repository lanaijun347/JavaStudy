package com.zsq.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    // 无参构造
    // 在创建登录界面时，同时设置这个界面的信息
   public LoginJFrame(){
       // 设置界面的宽高
        this.setSize(488, 430);
        // 设置界面的标题
        this.setTitle("拼图游戏登录");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
       this.setLocationRelativeTo(null);
        // 设置游戏关闭模式
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 让界面显示
        this.setVisible(true);
   }
}
