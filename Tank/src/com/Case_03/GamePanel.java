package com.Case_03;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Tank tank = new Tank();
    public void paint(Graphics g) {
        super.paint(g);
        ImageIcon icon = new ImageIcon(tank.getUrl());
        g.drawImage(icon.getImage(),tank.getX(), tank.getY(), this);
    }
}
