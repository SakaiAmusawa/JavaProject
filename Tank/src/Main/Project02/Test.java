package Main.Project02;

import javax.swing.*;

//现阶段只能向上射击
public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TANK");
        MyPanel myPanel = new MyPanel();
        frame.add(myPanel);
        frame.addKeyListener(myPanel);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
    }
}
