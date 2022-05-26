package Main.Project03;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TankGame");
        MyPanel myPanel = new MyPanel();
        //ÉèÖÃ´°¿ÚÈ«ÆÁ
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(dim);
        frame.add(myPanel);
        frame.addKeyListener(myPanel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
