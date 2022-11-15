package com.views.components;

import javax.swing.*;

public class NewFrame extends JFrame{
//    static JFrame frame = new JFrame();
//    static JPanel mainPanel = new JPanel();
    static Sidebar sb= new Sidebar();
    JFrame fr = new JFrame();

    public NewFrame (String title){
        setTitle(title);
        setSize(1920, 1080);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        add(sb.display());
//        getContentPane().removeAll();
//        fr.setExtendedState(State.);
//        this.panel =

//        frame.add(sb.display());
//        add();
//        setVisible(true);
//        frame.transferFocus();
    }

//    public static void changeDisplay(JPanel destPanel){
//        mainPanel.removeAll();
//        mainPanel.add(sb.display());
//        mainPanel.add(destPanel);
//    }

//    public void resetDisplay(){
//        frame.removeAll();
//    }
}
