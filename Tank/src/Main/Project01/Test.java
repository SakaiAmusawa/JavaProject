package Main.Project01;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TANK");
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.addKeyListener(gamePanel);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
