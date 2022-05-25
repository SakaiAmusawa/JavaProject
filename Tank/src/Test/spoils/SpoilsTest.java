package Test.spoils;

import javax.swing.*;

public class SpoilsTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TANK");
        SpoilsPanel spoilsPanel = new SpoilsPanel();
        frame.add(spoilsPanel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
