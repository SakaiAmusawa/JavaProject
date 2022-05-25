package com.Expanding_practice.spoils;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SpoilsPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        Random random = new Random();
        ImageIcon icon = new ImageIcon("img/spoils.jpg");
        g.drawImage(icon.getImage(), random.nextInt(600), random.nextInt(600), this);
    }
}
