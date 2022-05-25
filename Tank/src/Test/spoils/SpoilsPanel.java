package Test.spoils;

import javax.swing.*;
import java.awt.*;

public class SpoilsPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        Spoils spoils = new Spoils();
        ImageIcon icon = new ImageIcon(spoils.getUrl());
        g.drawImage(icon.getImage(), spoils.getX(), spoils.getY(), this);
    }
}
