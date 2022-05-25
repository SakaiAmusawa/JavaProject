package Test.Bullet;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("≈⁄µØ“∆∂Ø≤‚ ‘");
        GamePanel gamePanel = new GamePanel();
        new Thread(gamePanel).start();
        frame.add(gamePanel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
