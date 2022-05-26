package Main.Project03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    // 创建坦克对象
    Tank tank = new Tank(900, 900, this);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 设置背景颜色
        setBackground(Color.BLACK);
        // 绘制坦克
        tank.draw(g);
        // 绘制炮弹
        tank.drawBullets(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 37) {
            // 向左
            tank.moveL();
        } else if (key == 38) {
            // 向上
            tank.moveU();
        } else if (key == 39) {
            // 向右
            tank.moveR();
        } else if (key == 40) {
            // 向下
            tank.moveD();
        } else if (key == 32) {
            // 按下空格发射炮弹
            tank.fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}