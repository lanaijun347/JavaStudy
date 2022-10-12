package com.zsq.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class JButtonMouseListenerTest extends JFrame implements MouseListener {

    // 鼠标监听,支持 划入\划出\按下\点击\松开 方法
    JButton jButton1 = new JButton("按钮1");
    JButton jButton2 = new JButton("按钮2");
    Random random = new Random();

    JButtonMouseListenerTest(){
        this.setSize(603,680);
        this.setTitle("测试鼠标点击");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置，只有取消了才会按照xy轴的形式天价组件
        this.setLayout(null);

        jButton1.setBounds(0,0,100,50);
        jButton2.setBounds(random.nextInt(500), random.nextInt(500), 100, 50);

        // 给整个窗体添加鼠标监听
        // 调用者 this: 本类对象,当前的界面对象,表示我要给整个界面添加监听
        // addMouseListener: 表示要给本界面添加鼠标监听
        // 参数this: 当前事件被出发后,会执行本类中的对应方法(MouseListener 实现的重写方法)
        jButton1.addMouseListener(this);
        jButton2.addMouseListener(this);

        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");
        // 获取按钮名
        Object source = e.getSource();
        if (source == jButton2){
            // 随机更改按钮位置大小
            jButton2.setBounds(random.nextInt(500), random.nextInt(500), random.nextInt(30,300), random.nextInt(20,300));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
