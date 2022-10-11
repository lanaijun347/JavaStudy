package com.zsq.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame() {
        this.setSize(488, 430);
        // 设置界面的标题
        this.setTitle("拼图游戏注册");
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
