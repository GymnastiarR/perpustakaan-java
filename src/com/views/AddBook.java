package com.views;

import com.font.Poppins;
import com.models.Books;
import com.views.components.NewFrame;
import com.views.components.Sidebar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import java.awt.*;


public class AddBook extends NewFrame{

    private static int labelLocaltionY = 120;
    JLabel coverDisplay = new JLabel( );
    private static boolean isDisplay = true;

    public AddBook(){
        super("Tambah Buku");
        view();
    }

    public void display(){
        setVisible(true);
    }

    public void unDisplay(){
        setVisible(false);
    }

    public void view(){

//        setSize(0, 0);

        Poppins poppins = new Poppins();

//        JPanel frame = new JPanel();
//        frame.setLayout(null);
//        frame.setBackground(Color.BLACK);
//        frame.setBounds(300, 0, 1000, 1080);

        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBounds(300, 0, 1620, 40);
        header.setBackground(Color.DARK_GRAY);

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
        fBookTitle.setFont(new Font("Poppins", Font.PLAIN, 16));
        fBookTitle.setBorder(BorderFactory.createCompoundBorder(
                fBookTitle.getBorder(),
                BorderFactory.createEmptyBorder(3, 5, 3, 5)));


        JLabel bookSynopsis = new JLabel("Masukkan Sinopsis Buku");
        bookSynopsis.setBounds(30, 210, 400, 30);
        bookSynopsis.setFont(poppins.poppinsRegular);

        JTextArea fSynopsis = new JTextArea();
        JScrollPane synopsis = new JScrollPane();
        synopsis.add(fSynopsis);
        synopsis.setBounds(30, (int)bookSynopsis.getY()+30, 400, 200 );

        JButton uploadImage = new JButton("Upload Image");
        uploadImage.setBackground(Color.darkGray);
        uploadImage.setForeground(Color.white);
        uploadImage.setFont(new Font("Poppins", Font.PLAIN, 13));
        uploadImage.setBounds(480, 450, 130, 40);


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

        ImageIcon cover = new ImageIcon(AddBook.class.getResource("../public/image/1655119642474.jpg"));

//        ImageIcon cover2 = new ImageIcon(f.toString());
        Image img = cover.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon cvr = new ImageIcon(img);

        coverDisplay.setIcon(cvr);
        coverDisplay.setBounds(480, 30, 300,400);

        content.add(synopsis);
        content.add(uploadImage);
        content.add(coverDisplay);
        content.add(bookSynopsis);
        content.add(fBookTitle);
        content.add(bookTitle);
        content.add(label);

        add(content);
    }

}
