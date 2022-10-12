package com.zsq.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame{

    int[][] data = new int[4][4];

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据（打乱）
        initData();

        // 初始化图片
        initImage();

        // 让界面显示
        this.setVisible(true);
    }

    // 初始化数据（打乱）
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        // 打乱一维数组
        for (int i = 0; i < tempArr.length; i++) {
            int index = random.nextInt(tempArr.length);
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;
        }
        // 用一位数组给二维数组赋值
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    private void initImage() {
        // 循坏添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取加载图片的序号
                int num = data[i][j];
                // 创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon("puzzlegame\\image\\girl\\girl1\\" + num + ".jpg");
                // 创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中
                this.getContentPane().add(jLabel);
                // 添加一次之后number自增，添加下一张图片
            }
        }

        // 添加背景图片(背景图片要最后添加,先加的在下面,后加的在前面)
        ImageIcon iconBack = new ImageIcon("puzzlegame\\image\\background.png");
        JLabel label = new JLabel(iconBack);
        label.setBounds(40, 40, 508, 560);
        this.getContentPane().add(label);
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
