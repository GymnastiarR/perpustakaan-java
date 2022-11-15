package com.views.components;

import javax.swing.*;

public class NewFrame extends JFrame{
    static JFrame frame = new JFrame();
    static Sidebar sb= new Sidebar();

    public static NewFrame (String title){
        frame.setTitle(title);
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(sb.display());
//        getContentPane().removeAll();
//        fr.setExtendedState(State.);
//        this.panel =

//        frame.add(sb.display());
//        add();
//        setVisible(true);
//        frame.transferFocus();
    }

    public static void changeDisplay(JPanel destPanel){
        mainPanel.removeAll();
        mainPanel.add(sb.display());
        mainPanel.add(destPanel);
    }

//    public void resetDisplay(){
//        frame.removeAll();
//    }
}
