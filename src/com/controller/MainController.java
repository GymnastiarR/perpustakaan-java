package com.controller;

import com.views.AddBook;
import com.views.components.NewFrame;

import javax.swing.*;
import java.awt.*;

public class MainController{

//    public MainController(){
//        super("Perpustakaan Ku");
//        add();
//    }

//    public void display(){
//        AddBook bookView = new AddBook();
//        add(bookView.display());
//        setVisible(true);
//    }
    static JFrame fr = new JFrame();
    public static void main(String[] args) {
        fr.setSize(1920, 1080);
        fr.setLayout(null);
        AddBook book = new AddBook();
//        fr.add(book.display());
        JLabel label = new JLabel("Testing");
        label.setBounds(30, 30, 300, 50);
        label.setFont(new Font("Poppins", Font.PLAIN, 40));

        JPanel pn = new JPanel();
        pn.setLayout(null);
        pn.add(label);
        pn.setBounds(0, 0, 300, 1080);
        pn.setBackground(Color.DARK_GRAY);


        fr.add(pn);
        fr.setVisible(true);
    }

}
