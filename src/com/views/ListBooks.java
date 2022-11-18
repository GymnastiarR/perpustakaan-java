package com.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;

public class ListBooks{
    public JPanel display(ResultSet rs){
        int labelLocationY = 0;

        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBounds(300, 40, 1620, 1080);
        content.setBackground(Color.white);

        JLabel titlePage = new JLabel("List Buku");
        titlePage.setFont(new Font("Poppins Medium", Font.PLAIN, 30));
        titlePage.setBounds(40, 40, 400, 30);
        content.add(titlePage);

        JPanel listBooks = new JPanel();
        listBooks.setBounds(40, 80, 1000,2000);
//        listBooks.setPreferredSize(new Dimension(1000, 2000));
//        listBooks.setLocation(40, 80);
        listBooks.setLayout(null);
//        listBooks.setAutoscrolls(true);
//        listBooks.setLayout(new BoxLayout(new Container(), 1));


        JScrollPane scrollListBooks = new JScrollPane();
        scrollListBooks.setBounds(40, 80, 1000,500);
        scrollListBooks.setViewportView(listBooks);
//        scrollListBooks.add(listBooks);
        scrollListBooks.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//        scrollListBooks.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        try{
            while(rs.next()){

//                JScrollPane jScrollPane = new JScrollPane();
//                jScrollPane.setLayout(GridLayout);
                ImageIcon cover = new ImageIcon(this.getClass().getResource("../public/image/1655119642474.jpg"));
                Image img = cover.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                ImageIcon cvr = new ImageIcon(img);
                JLabel coverDisplay = new JLabel();
                coverDisplay.setIcon(cvr);
                coverDisplay.setBounds(20, labelLocationY + 20, 300, 400);

                JLabel labelJudul = new JLabel(rs.getString("name"));
                labelJudul.setBounds(350, labelLocationY+20, 300, 30);
                labelJudul.setFont(new Font("Poppins", Font.PLAIN, 20));

                JLabel synopsis = new JLabel(rs.getString("synopsis"));
                synopsis.setBounds( 350, (int)labelJudul.getY() + 40, 300, 300 );
                synopsis.setFont(new Font("Poppins", Font.PLAIN, 16));

                JButton editButton = new JButton("Edit");
                editButton.setBounds(350, (int)synopsis.getY() + 20, 120, 30);
                editButton.setFont(new Font("Poppins", Font.PLAIN, 16));
                editButton.setBackground(Color.darkGray);
                editButton.setForeground(Color.white);

                int id = rs.getInt("id");

                editButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            System.out.println(id);
                        }catch (Exception error){
                            error.printStackTrace();
                        }
                    }
                });

                labelLocationY += 600;
                listBooks.add(coverDisplay);
                listBooks.add(editButton);
                listBooks.add(synopsis);
                listBooks.add(labelJudul);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        content.add(scrollListBooks);

        return content;
    }
}
