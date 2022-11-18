package com.views;

import javax.swing.*;
import java.awt.*;


public class ListBorrow extends Canvas{
    public JPanel display() {
        JPanel contain = new JPanel();
        contain.setBounds(300,40,1620, 1040);
        contain.setLayout(null);

        JLabel label = new JLabel("Peminjaman Buku");
        label.setBounds(35, 40, 400, 40);
        label.setFont(new Font("Poppins", Font.BOLD, 30));

        JLabel IdBook = new JLabel("ID Buku");
        IdBook.setBounds(30, 110 , 300, 30);
        IdBook.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField AddId = new JTextField();
        AddId.setBounds(30, 150 , 300, 30);

        JLabel namaPeminjam = new JLabel("Nama Peminjam");
        namaPeminjam.setBounds(30, 210 , 300, 30);
        namaPeminjam.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField AddPeminjam = new JTextField();
        AddPeminjam.setBounds(30, 250 , 300, 30);

        JButton daftarPinjam = new JButton("Pinjam");
        daftarPinjam.setBounds(70,500, 200, 50);
        daftarPinjam.setBackground(Color.DARK_GRAY);
        daftarPinjam.setForeground(Color.white);

        contain.add(IdBook);
        contain.add(AddId);
        contain.add(label);
        contain.add(daftarPinjam);
        contain.add(namaPeminjam);
        contain.add(AddPeminjam);

        return contain;
    }
}