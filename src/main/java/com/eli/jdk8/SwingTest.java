package com.eli.jdk8;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by pekah on 2017/3/22.
 */
public class SwingTest {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButto");

        jButton.addActionListener(e -> System.out.println("hello"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
