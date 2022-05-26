package Main.Project03;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TankGame");
        MyPanel myPanel = new MyPanel();
        frame.add(myPanel);
        frame.addKeyListener(myPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
    }
}
