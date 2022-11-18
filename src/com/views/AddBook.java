package com.views;

import com.controller.AddBookController;
import com.font.Poppins;
import com.views.components.Sidebar;

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
//        paintComponent();
        JLabel coverDisplay = new JLabel( );

        Poppins poppins = new Poppins();

        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBounds(300, 40, 1620, 1080);
        content.setBackground(Color.white);

        JLabel label = new JLabel("Tambah Buku Baru");
        label.setBounds(30, 30, 400, 40);
        label.setFont(poppins.poppins);

        JLabel bookTitle = new JLabel("Masukkan Judul Buku");
        bookTitle.setBounds(30, 100, 400, 30);
        bookTitle.setFont(new Font("Poppins", Font.PLAIN, 20));

        JTextField fBookTitle = new JTextField();
        fBookTitle.setBounds(30, 145, 400, 33);
        fBookTitle.setFont(new Font("Poppins", Font.PLAIN, 14));
        fBookTitle.setBorder(BorderFactory.createCompoundBorder(
                fBookTitle.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));


        JLabel bookSynopsis = new JLabel("Masukkan Sinopsis Buku");
        bookSynopsis.setBounds(30, 210, 400, 30);
        bookSynopsis.setFont(poppins.poppinsRegular);

        JTextArea fSynopsis = new JTextArea();
        JScrollPane synopsis = new JScrollPane(fSynopsis);

        fSynopsis.setLineWrap(true);
        fSynopsis.setWrapStyleWord(true);
        fSynopsis.setFont(new Font("Poppins", Font.PLAIN, 14));

//        synopsis.add(fSynopsis);
        synopsis.setBounds(30, (int)bookSynopsis.getY()+40, 400, 200 );
        fSynopsis.setBounds(30, (int)bookSynopsis.getY()+40, 400, 200 );
        synopsis.setViewportView(fSynopsis);
//        synopsis.setLayout(null);

        fSynopsis.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton uploadImage = new JButton("Upload Image");
        uploadImage.setBackground(Color.darkGray);
        uploadImage.setForeground(Color.white);
        uploadImage.setFont(new Font("Poppins", Font.PLAIN, 13));
        uploadImage.setBounds(480, 450, 130, 40);

        JButton newBook = new JButton("Tambah Buku");
        newBook.setBounds(130, (int) fSynopsis.getY() + 500, 200, 50);
        newBook.setBackground(Color.DARK_GRAY);
        newBook.setForeground(Color.white);

        newBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddBookController.setNewBook(fBookTitle.getText(), fSynopsis.getText());
//                JOptionPane BerhasilTambahData = new JOptionPane();
                fBookTitle.setText("");
                fSynopsis.setText("");
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


        content.add(synopsis);
        content.add(uploadImage);
        content.add(coverDisplay);
//        content.add(fSynopsis);
        content.add(bookSynopsis);
        content.add(fBookTitle);
        content.add(bookTitle);
        content.add(label);
        content.add(newBook);


        return content;
    }

}
