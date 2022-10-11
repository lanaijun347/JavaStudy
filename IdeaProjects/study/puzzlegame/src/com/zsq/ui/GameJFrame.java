package com.zsq.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化图片
        initImage();

        // 让界面显示
        this.setVisible(true);
    }

    // 初始化图片
    private void initImage() {

        int number = 1;
        // 循坏添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon("F:\\JavaStudy\\IdeaProjects\\study\\puzzlegame\\image\\girl\\girl1\\" + number + ".jpg");
                // 创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);
                // 添加一次之后number自增，添加下一张图片
                number++;
            }
        }
    }

    // 初始化菜单
    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上面的选项的对象 （菜单 设置 关于等）
        JMenu functionMenu = new JMenu("菜单");
        JMenu aboutMenu = new JMenu("关于我们");

        // 创建选项下面的条目对象 （重新游戏 更换图片 重新登录 关闭游戏等）
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem replacePictureItem = new JMenuItem("更换图片");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeGameItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        // 将每一个选项下面的条目添加到对应选择中
        functionMenu.add(replayItem);
        functionMenu.add(replacePictureItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeGameItem);

        aboutMenu.add(accountItem);

        // 将选项添加到菜单中
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    // 初始化界面
    private void initJFrame() {
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图游戏单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 取消默认的居中放置，只有取消了才会按照xy轴的形式天价组件
        this.setLayout(null);
    }
}
