package Test.Bullet;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    int x = 10;
    int y = 100;

    public void paint(Graphics g) {
        super.paint(g);
 /*       //ͨ��forѭ��ʹ�ڵ��ƶ�50����λ
        for (int i = 0; i < 100; i++) {
            //x,yΪ0,0���� width,height�����Լ��趨�Ĵ��ڴ�С����
            g.clearRect(0, 0, 300, 300);
            g.fillOval(x + i * 3, y, 10, 10);

        }

    }*/
        g.fillOval(x, y, 10, 10);
    }

    @Override
    public void run() {
        while (true) {
            y--;//�����ƶ�
            x++;//�����ƶ�
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
