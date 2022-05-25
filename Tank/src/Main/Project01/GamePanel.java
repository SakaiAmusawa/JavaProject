package Main.Project01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {
    Tank tank = new Tank(450, 900);

    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.BLACK);
        ImageIcon icon = new ImageIcon(tank.getUrl());
        Image image = icon.getImage();
        g.drawImage(image, tank.getX(), tank.getY(), 50, 50, this);
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
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
