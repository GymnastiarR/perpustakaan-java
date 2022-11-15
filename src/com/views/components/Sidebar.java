package com.views.components;
import com.controller.AddBookController;
import com.controller.Controller;
import com.controller.ListViewController;
import com.views.ListBooks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sidebar extends JFrame{

    public JPanel display(){
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 300, 1080);
        panel.setBackground(new Color(0,0,0,50));
        panel.setLayout(null);

        JButton listBookDisplay = new JButton("List Book");
        listBookDisplay.setBounds(20, 20, 200, 40);
        listBookDisplay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.ListBookController(true);
//                try {
////                    long start = System.currentTimeMillis();
//                    Thread.sleep(200);
//                }catch (InterruptedException a){
//                    a.printStackTrace();
//                }
//                Controller.addBookController();
                Controller.addBookController(false);
            }
        });

        panel.add(listBookDisplay);
        return panel;
    }

}
