package com.views;
import com.views.components.NewFrame;
import com.views.components.Sidebar;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class ListBooks extends NewFrame{

    static int labelLocationY = 0;

    public ListBooks(){
        super("List Buku");
    }

//    public void unDisplay(){
//        setVisible(false);
//    }

    public void display(ResultSet rs){
        setSize(0, 0);


        JPanel frame = new JPanel();
        frame.setLayout(null);

        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBounds(300, 0, 1620, 1080);
        content.setBackground(Color.white);

        try{
            while(rs.next()){
                System.out.println("Halo");
                JLabel labelJudul = new JLabel(rs.getString("name"));
                labelJudul.setBounds(20, labelLocationY+20, 300, 30);
                labelJudul.setFont(new Font("Poppins", Font.PLAIN, 20));
                labelLocationY += 30;
                content.add(labelJudul);
                System.out.println(rs.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        add(content);
        setVisible(true);
    }
}
