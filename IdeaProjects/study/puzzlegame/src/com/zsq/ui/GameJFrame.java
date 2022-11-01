package com.zsq.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    private int[][] data = new int[4][4];
    // 记录空白方块在二位数组的位置
    private int x = 0;
    private int y = 0;
    // 存储图片路径
    private final String path = "puzzlegame\\image\\girl\\girl2\\";
    // 定义一个二维数组，存储正确的数据
    private final int[][] win = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    // 统计步数
    private int step = 0;
    // 创建选项下面的条目对象 （重新游戏 更换图片 重新登录 关闭游戏等）
    private final JMenuItem replayItem = new JMenuItem("重新游戏");
    private final JMenuItem replacePictureItem = new JMenuItem("更换图片");
    private final JMenuItem reLoginItem = new JMenuItem("重新登录");
    private final JMenuItem closeGameItem = new JMenuItem("关闭游戏");
    private final JMenuItem accountItem = new JMenuItem("公众号");

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
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    private void initImage() {
        // 清空原本已经出现的图片
        this.getContentPane().removeAll();

        // 判断游戏是否胜利
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepJLabel = new JLabel("步数：" + step);
        stepJLabel.setBounds(50, 30, 120, 30);
        this.getContentPane().add(stepJLabel);

        // 循坏添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取加载图片的序号
                int num = data[i][j];
                // 创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
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

        // 刷新界面
        this.getContentPane().repaint();
    }

    // 初始化菜单
    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单上面的选项的对象 （菜单 设置 关于等）
        JMenu functionMenu = new JMenu("菜单");
        JMenu aboutMenu = new JMenu("关于我们");

        // 将每一个选项下面的条目添加到对应选择中
        functionMenu.add(replayItem);
        functionMenu.add(replacePictureItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeGameItem);

        aboutMenu.add(accountItem);

        // 给条目绑定事件
        replayItem.addActionListener(this);
        replacePictureItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeGameItem.addActionListener(this);
        accountItem.addActionListener(this);

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
        // 给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 按下不松时调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            // 把界面中的所有图片删除
            this.getContentPane().removeAll();
            // 加载第一张完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            // 加载背景图片
            JLabel iconBack = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            iconBack.setBounds(40, 40, 508, 560);
            this.getContentPane().add(iconBack);
            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    // 松开按键的时候调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        // 判断游戏是否胜利，胜利就没必要往下了
        if (victory()) {
            return;
        }

        // 把二维数组中的0进行交换
        // 对上下左右进行判断
        // 左：37  上：38 右：39 下：40
        int code = e.getKeyCode(); // 获取键盘按键的值
        // System.out.println(code);
        if (code == 37) {
            //System.out.println("向左移动");
            if (y < 3) {
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
            }
        } else if (code == 38) {
            //System.out.println("向上移动");
            if (x < 3) {
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                step++;
            }
        } else if (code == 39) {
            //System.out.println("向右移动");
            if (y > 0) {
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;
                step++;
            }
        } else if (code == 40) {
            //System.out.println("向下移动");
            if (x > 0) {
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
            }
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = win;
            step++;
        } else {
            return;
        }
        // 重新加载图片
        initImage();
    }

    // 判断data中的数据是否跟win中相同，相同游戏结束，显示WIN的图片
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的条目对象
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");
            // 计步器清零
            step = 0;
            // 再次打乱二维数组数据
            initData();
            // 重新加载图片
            initImage();
        } else if (obj == replacePictureItem) {
            System.out.println("更换图片");
        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            // 关闭当前游戏界面
            this.setVisible(false);
            // 打开登录界面
            new LoginJFrame();
        } else if (obj == closeGameItem) {
            System.out.println("关闭游戏");
            // 直接关闭虚拟机即可
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("公众号");
            // 创建一个弹框对象
            JDialog jDialog = new JDialog();
            // 创建一个管理图片的容器对象
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            // 设置弹框大小
            jDialog.setSize(344,344);
            // 弹框置顶
            jDialog.setAlwaysOnTop(true);
            // 弹框居中
            jDialog.setLocationRelativeTo(null);
            // 弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            // 显示弹框
            jDialog.setVisible(true);
        }
    }
}
