package Main.Project03;


import java.awt.*;

public class Bullet implements Runnable {
    // 属性
    private int x;
    private int y;
    // 炮弹方向
    private final int d;
    // 保存炮弹绘制的面板对象，以便炮弹位置发生变化通知面板重新绘制
    private final MyPanel myPanel;

    public Bullet(int x, int y, int d, MyPanel myPanel) {
        // TODO Auto-generated constructor stub
        this.x = x;
        this.y = y;
        this.d = d;
        this.myPanel = myPanel;
    }

    // 绘制炮弹
    public void draw(Graphics g) {
        // 设置炮弹为白色
        g.setColor(Color.WHITE);
        g.fillOval(x+15, y, 20, 20);
    }

    // 炮弹运行
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            // 休息一会
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            move();
            // 通知面板重新绘制
            myPanel.repaint();
        }
    }

    public void move() {
        // 炮弹速度
        int speed = 5;
        if (d == 37) {
            // 向左
            x -= speed;
        } else if (d == 38) {
            // 向上
            y -= speed;
        } else if (d == 39) {
            // 向右
            x += speed;
        } else if (d == 40) {
            // 向下
            y += speed;
        }
    }
}
