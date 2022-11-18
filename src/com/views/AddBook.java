package com.views;

import com.controller.AddBookController;
import com.font.Poppins;
import com.toedter.calendar.JDateChooser;
import com.views.components.Sidebar;
import com.views.elementFactory.Label;
import com.views.elementFactory.TextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class AddBook extends Canvas{
    private static int labelLocaltionY = 120;
//    JLabel coverDisplay = new JLabel( );
    private static boolean isDisplay = true;


    public void paintComponent(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("1655119642474.jpg");
//        i = i.getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        g.drawImage(i, 480,40,this);
    }

    public JPanel display(){
        JLabel coverDisplay = new JLabel();

        JPanel content = new JPanel();
        content.setBounds(300, 40, 1620, 1080);
        content.setBackground(Color.white);
        content.setLayout(null);

        //Title Page
        JLabel label = new JLabel("Tambah Buku Baru");
        label.setBounds(30, 30, 400, 40);
        label.setFont(new Font("Poppins Medium", Font.BOLD, 30));

        //Untuk Judul Buku

        Label bookTitle = new Label(100, "Judul Buku");
        TextField fBookTitle = new TextField(145);

        //Untuk sinopsis Buku
        Label bookSynopsis = new Label(210, "Masukkan Sinopsis Buku");

//        TextField fSynopsis = new TextField();
        JTextArea fSynopsis = new JTextArea();
        JScrollPane synopsis = new JScrollPane(fSynopsis);

        fSynopsis.setLineWrap(true);
        fSynopsis.setWrapStyleWord(true);
        fSynopsis.setFont(new Font("Poppins", Font.PLAIN, 14));

        synopsis.setBounds(30, (int)bookSynopsis.getY()+40, 400, 200 );
        fSynopsis.setBounds(30, (int)bookSynopsis.getY()+40, 400, 200 );
        synopsis.setViewportView(fSynopsis);

        fSynopsis.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        //Untuk Nama Penulis
        Label penulis = new Label((int)synopsis.getY()+240, "Penulis Buku");
        TextField fPenulis = new TextField(penulis.getY() + 40);

        //Untuk Tanggal
        Label date = new Label(fPenulis.getY() + 60, "Tanggal Penerbitan Buku");

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(30, date.getY() + 40, 200, 30);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        //Untuk Tombol Kirim
        JButton newBook = new JButton("Tambah Buku");
        newBook.setBounds(30, (int) dateChooser.getY() + 60, 200, 50);
        newBook.setBackground(Color.DARK_GRAY);
        newBook.setForeground(Color.white);

        //Untuk upload gambar
        JButton uploadImage = new JButton("Upload Image");
        uploadImage.setBackground(Color.darkGray);
        uploadImage.setForeground(Color.white);
        uploadImage.setFont(new Font("Poppins", Font.PLAIN, 13));
        uploadImage.setBounds(480, 450, 130, 40);


        newBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                AddBookController.setNewBook(fBookTitle.getText(), fSynopsis.getText(), fPenulis.getText(),format.format(dateChooser.getDate()));
                int confirmation = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menambah Buku ?",
                        "Book Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if(confirmation == 0){
                    AddBookController.setNewBook(fBookTitle.getText(), fSynopsis.getText(), fPenulis.getText(), format.format(dateChooser.getDate()));
                    fPenulis.setText("");
                    dateChooser.setDate(null);
                    fBookTitle.setText("");
                    fSynopsis.setText("");

                    JOptionPane.showMessageDialog(null, "Buku Sudah Tersimpan");
                }
            }
        });


        ActionListener upload = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser chooser = new JFileChooser();
                        chooser.showOpenDialog(null);
                        try {
                            File f = chooser.getSelectedFile();
                            ImageIcon imgCover = new ImageIcon(f.toString());
                            Image img = imgCover.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
                            ImageIcon imgCover2 = new ImageIcon(img);
                            coverDisplay.setIcon(imgCover2);
                        } catch (NullPointerException error){
                    error.printStackTrace();
                }
            }
        };

        uploadImage.addActionListener(upload);

        ImageIcon cover = new ImageIcon(this.getClass().getResource("../public/image/1655119642474.jpg"));
        Image img = cover.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon cvr = new ImageIcon(img);

        coverDisplay.setIcon(cvr);
        coverDisplay.setBounds(480, 40, 300, 400);


        content.add(date);
        content.add(dateChooser);
        content.add(penulis);
        content.add(fPenulis);
        content.add(synopsis);
        content.add(uploadImage);
        content.add(coverDisplay);
        content.add(bookSynopsis);
        content.add(fBookTitle);
        content.add(bookTitle);
        content.add(label);
        content.add(newBook);

        return content;
    }

}
