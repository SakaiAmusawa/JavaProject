package Test.Bullet;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    int x = 10;
    int y = 100;

    public void paint(Graphics g) {
        super.paint(g);
 /*       //通过for循环使炮弹移动50个单位
        for (int i = 0; i < 100; i++) {
            //x,y为0,0坐标 width,height根据自己设定的窗口大小设置
            g.clearRect(0, 0, 300, 300);
            g.fillOval(x + i * 3, y, 10, 10);

        }

    }*/
        g.fillOval(x, y, 10, 10);
    }

    @Override
    public void run() {
        while (true) {
            y--;//向上移动
            x++;//想右移动
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
