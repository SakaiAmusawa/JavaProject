package com.Case_03;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TANK");
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}