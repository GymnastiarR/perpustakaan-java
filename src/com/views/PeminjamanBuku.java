package com.views;

import com.controller.AddBookController;
import com.font.Poppins;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class PeminjamanBuku extends Canvas{
    public JPanel display() {
        JPanel contain = new JPanel();
        contain.setBounds(300,40,1620, 1040);
        contain.setLayout(null);

        JLabel label = new JLabel("Peminjaman Buku");
        label.setBounds(470, 40, 400, 40);
        label.setFont(new Font("Poppins", Font.BOLD, 30));

        JLabel IdTransaksi = new JLabel("ID Transaksi");
        IdTransaksi.setBounds(30, 110 , 300, 30);
        IdTransaksi.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField fIdTransaksi = new JTextField();
        fIdTransaksi.setBounds(30, 145 , 400, 33);
        fIdTransaksi.setFont(new Font("Poppins", Font.PLAIN, 14));
        fIdTransaksi.setBorder(BorderFactory.createCompoundBorder(
                fIdTransaksi.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));

        JLabel IdBook = new JLabel("ID Buku");
        IdBook.setBounds(30, 205 , 300, 30);
        IdBook.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField AddId = new JTextField();
        AddId.setBounds(30, 240 , 400, 33);
        AddId.setFont(new Font("Poppins", Font.PLAIN, 14));
        AddId.setBorder(BorderFactory.createCompoundBorder(
                AddId.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));

        JLabel namaPeminjam = new JLabel("ID Peminjam");
        namaPeminjam.setBounds(30, 300 , 300, 30);
        namaPeminjam.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField AddPeminjam = new JTextField();
        AddPeminjam.setBounds(30, 335 , 400, 33);
        AddPeminjam.setFont(new Font("Poppins", Font.PLAIN, 14));
        AddPeminjam.setBorder(BorderFactory.createCompoundBorder(
                AddPeminjam.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));

        JLabel tanggalPinjam = new JLabel("Tanggal Pinjam");
        tanggalPinjam.setBounds(30, 395 , 300, 30);
        tanggalPinjam.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField ftanggalPinjam = new JTextField();
        ftanggalPinjam.setBounds(30, 430 , 400, 33);
        ftanggalPinjam.setFont(new Font("Poppins", Font.PLAIN, 14));
        ftanggalPinjam.setBorder(BorderFactory.createCompoundBorder(
                ftanggalPinjam.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));

        JLabel tanggalReturn = new JLabel("Tanggal Pengembalian");
        tanggalReturn.setBounds(30, 490 , 300, 30);
        tanggalReturn.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField ftanggalReturn = new JTextField();
        ftanggalReturn.setBounds(30, 525 , 400, 33);
        ftanggalReturn.setFont(new Font("Poppins", Font.PLAIN, 14));
        ftanggalReturn.setBorder(BorderFactory.createCompoundBorder(
                ftanggalReturn.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));

        JButton daftarPinjam = new JButton("Pinjam");
        daftarPinjam.setBounds(120,625, 200, 50);
        daftarPinjam.setBackground(Color.DARK_GRAY);
        daftarPinjam.setForeground(Color.white);

        contain.add(IdBook);
        contain.add(AddId);
        contain.add(label);
        contain.add(IdTransaksi);
        contain.add(fIdTransaksi);
        contain.add(daftarPinjam);
        contain.add(namaPeminjam);
        contain.add(AddPeminjam);
        contain.add(tanggalPinjam);
        contain.add(ftanggalPinjam);
        contain.add(tanggalReturn);
        contain.add(ftanggalReturn);

        return contain;
    }
}