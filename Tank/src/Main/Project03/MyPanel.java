package Main.Project03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    // ����̹�˶���
    Tank tank = new Tank(900, 900, this);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // ���ñ�����ɫ
        setBackground(Color.BLACK);
        // ����̹��
        tank.draw(g);
        // �����ڵ�
        tank.drawBullets(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 37) {
            // ����
            tank.moveL();
        } else if (key == 38) {
            // ����
            tank.moveU();
        } else if (key == 39) {
            // ����
            tank.moveR();
        } else if (key == 40) {
            // ����
            tank.moveD();
        } else if (key == 32) {
            // ���¿ո����ڵ�
            tank.fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}