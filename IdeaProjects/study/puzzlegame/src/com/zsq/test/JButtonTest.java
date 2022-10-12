package com.zsq.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(400,400);
        jFrame.setTitle("按钮测试");
        // 设置界面居中
        jFrame.setLocationRelativeTo(null);
        // 设置游戏关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置，只有取消了才会按照xy轴的形式天价组件
        jFrame.setLayout(null);

        // 创建一个按钮对象
        JButton jButton = new JButton("点我");
        // 设置按钮位置和宽高
        jButton.setBounds(0,0,100,50);
        // 给按钮添加动作监听
        // jButton:组件对象,表示给那个组件添加事件
        // addActionListener:表示我要给组件添加那个事件监听(动作监听包含鼠标左键点击,空格)
        // 参数:表示事件被触发之后要执行的代码
        // 匿名内部类:只为了实现该按钮事件,之后并无其他作用
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("达咩哟~达咩~达咩~");
            }
        });

        // 把按钮添加到界面中
        jFrame.getContentPane().add(jButton);

        //显示
        jFrame.setVisible(true);
    }
}
