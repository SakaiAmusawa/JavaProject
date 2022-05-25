package com.Expanding_practice.spoils;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TANK");
        SpoilsPanel spoilsPanel = new SpoilsPanel();
        frame.add(spoilsPanel);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
