package Main.Project03;


import java.awt.*;

public class Bullet implements Runnable {
    // ����
    private int x;
    private int y;
    // �ڵ�����
    private final int d;
    // �����ڵ����Ƶ��������Ա��ڵ�λ�÷����仯֪ͨ������»���
    private final MyPanel myPanel;

    public Bullet(int x, int y, int d, MyPanel myPanel) {
        // TODO Auto-generated constructor stub
        this.x = x;
        this.y = y;
        this.d = d;
        this.myPanel = myPanel;
    }

    // �����ڵ�
    public void draw(Graphics g) {
        // �����ڵ�Ϊ��ɫ
        g.setColor(Color.WHITE);
        g.fillOval(x+15, y, 20, 20);
    }

    // �ڵ�����
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            // ��Ϣһ��
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            move();
            // ֪ͨ������»���
            myPanel.repaint();
        }
    }

    public void move() {
        // �ڵ��ٶ�
        int speed = 5;
        if (d == 37) {
            // ����
            x -= speed;
        } else if (d == 38) {
            // ����
            y -= speed;
        } else if (d == 39) {
            // ����
            x += speed;
        } else if (d == 40) {
            // ����
            y += speed;
        }
    }
}
