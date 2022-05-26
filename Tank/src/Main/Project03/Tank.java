package Main.Project03;

import javax.swing.*;
import java.awt.*;

public class Tank {
    // �ƶ��ٶ�
    private final int speed = 5;
    // �洢̹�˷�����ڵ�
    private final Bullet[] bullets;
    // ����̹�˷�����ڵ�,Ĭ�������Ϊnull����ʾû�з���
    // private Bullet bullet = null;
    // ����̹�˻��Ƶ��������Ա�̹��λ�÷����仯֪ͨ������»���
    private final MyPanel myPanel;
    // ̹������
    private int x;
    private int y;
    // ����
    private int d = 37;
    // Ĭ��̹������
    private String url = "img/p1tankU.gif";
    // �������ӵ�����
    private int num;

    // ���췽������ʼ��̹������
    public Tank(int x, int y, MyPanel myPanel) {
        this.x = x;
        this.y = y;
        this.myPanel = myPanel;
        // �洢�ڵ�����������Ϊ100
        this.bullets = new Bullet[100];
        // Ĭ���ӵ�����Ϊ0
        this.num = 0;
    }

    // ����̹�˶���
    public void draw(Graphics g) {
        // ��ȡ̹�˶���ͼƬ
        ImageIcon imageIcon = new ImageIcon(url);
        // ��̹��ͼƬת��Ϊg�ܹ����Ƶ���Ϣ
        Image image = imageIcon.getImage();
        // ����g�Ļ�ͼ��������̹�˶��󣬴�СΪ20*20
        g.drawImage(image, x, y, 50, 50, null);
    }

    // �����ڵ�
    public void drawBullets(Graphics g) {
        // ѭ�������洢�ڵ�������
        for (int i = 0; i < num; i++) {
            // ��������ȡ���ڵ�
            Bullet b = bullets[i];
            // �����ڵ�
            b.draw(g);
        }
    }

    // �����ڵ�
    public void fire() {
        // ʹ��̹�˵�λ�úͷ����ʼ���ڵ�
        Bullet bullet = new Bullet(x, y, d, myPanel);
        // ���ڵ�����������
        bullets[num] = bullet;
        // ��������
        num++;
        // �������У��̣߳�
        new Thread(bullet).start();
    }

    // �����ƶ�����
    public void moveL() {
        // �ı�̹�˷���ͼƬ
        d = 37;
        this.url = "img/p1tankL.gif";
        // �ı�̹��λ��
        this.x = this.x - speed;
        // ˢ��
        myPanel.repaint();
    }

    // �����ƶ�����
    public void moveR() {
        d = 39;
        this.url = "img/p1tankR.gif";
        this.x = this.x + speed;
        // ˢ��
        myPanel.repaint();
    }

    // �����ƶ�����
    public void moveU() {
        d = 38;
        this.url = "img/p1tankU.gif";
        this.y = this.y - speed;
        // ˢ��
        myPanel.repaint();
    }

    // �����ƶ�����
    public void moveD() {
        d = 40;
        this.url = "img/p1tankD.gif";
        this.y = this.y + speed;
        // ˢ��
        myPanel.repaint();
    }
}
