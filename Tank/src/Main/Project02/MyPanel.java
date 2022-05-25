package Main.Project02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    Tank tank = new Tank(100, 100, this);

    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        tank.draw(g);
        if (tank.getBullet() != null) {
            tank.getBullet().draw(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 37) {
            tank.moveL();
        } else if (e.getKeyCode() == 38) {
            tank.moveU();
        } else if (e.getKeyCode() == 39) {
            tank.moveR();
        } else if (e.getKeyCode() == 40) {
            tank.moveD();
        } else if (e.getKeyCode() == 32) {
            tank.fire();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

