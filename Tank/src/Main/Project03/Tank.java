package Main.Project03;

import javax.swing.*;
import java.awt.*;

public class Tank {
    // 移动速度
    private final int speed = 5;
    // 存储坦克发射的炮弹
    private final Bullet[] bullets;
    // 保存坦克发射的炮弹,默认情况下为null，表示没有发射
    // private Bullet bullet = null;
    // 保存坦克绘制的面板对象，以便坦克位置发生变化通知面板重新绘制
    private final MyPanel myPanel;
    // 坦克坐标
    private int x;
    private int y;
    // 方向
    private int d = 37;
    // 默认坦克向上
    private String url = "img/p1tankU.gif";
    // 数组中子弹个数
    private int num;

    // 构造方法，初始化坦克坐标
    public Tank(int x, int y, MyPanel myPanel) {
        this.x = x;
        this.y = y;
        this.myPanel = myPanel;
        // 存储炮弹的数组容器为100
        this.bullets = new Bullet[100];
        // 默认子弹个数为0
        this.num = 0;
    }

    // 绘制坦克对象
    public void draw(Graphics g) {
        // 获取坦克对象图片
        ImageIcon imageIcon = new ImageIcon(url);
        // 将坦克图片转换为g能够绘制的信息
        Image image = imageIcon.getImage();
        // 调用g的绘图方法绘制坦克对象，大小为20*20
        g.drawImage(image, x, y, 50, 50, null);
    }

    // 绘制炮弹
    public void drawBullets(Graphics g) {
        // 循环遍历存储炮弹的数组
        for (int i = 0; i < num; i++) {
            // 从数组中取出炮弹
            Bullet b = bullets[i];
            // 绘制炮弹
            b.draw(g);
        }
    }

    // 发射炮弹
    public void fire() {
        // 使用坦克的位置和方向初始化炮弹
        Bullet bullet = new Bullet(x, y, d, myPanel);
        // 将炮弹存入数组中
        bullets[num] = bullet;
        // 容量增加
        num++;
        // 启动运行（线程）
        new Thread(bullet).start();
    }

    // 向左移动方法
    public void moveL() {
        // 改变坦克方向图片
        d = 37;
        this.url = "img/p1tankL.gif";
        // 改变坦克位置
        this.x = this.x - speed;
        // 刷新
        myPanel.repaint();
    }

    // 向右移动方法
    public void moveR() {
        d = 39;
        this.url = "img/p1tankR.gif";
        this.x = this.x + speed;
        // 刷新
        myPanel.repaint();
    }

    // 向上移动方法
    public void moveU() {
        d = 38;
        this.url = "img/p1tankU.gif";
        this.y = this.y - speed;
        // 刷新
        myPanel.repaint();
    }

    // 向下移动方法
    public void moveD() {
        d = 40;
        this.url = "img/p1tankD.gif";
        this.y = this.y + speed;
        // 刷新
        myPanel.repaint();
    }
}
