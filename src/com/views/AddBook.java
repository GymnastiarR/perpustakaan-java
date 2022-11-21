package com.views;

import com.controller.AddBookController;
import com.mysql.cj.jdbc.jmx.LoadBalanceConnectionGroupManager;
import com.toedter.calendar.JDateChooser;
import com.views.elementFactory.Label;
import com.views.elementFactory.TextField;
import com.views.rules.Genre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class AddBook implements Genre {
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

        JTextArea fSynopsis = new JTextArea();
        JScrollPane synopsis = new JScrollPane(fSynopsis);

        fSynopsis.setLineWrap(true);
        fSynopsis.setWrapStyleWord(true);
        fSynopsis.setFont(new Font("Poppins", Font.PLAIN, 14));

        synopsis.setBounds(30, bookSynopsis.getY()+40, 400, 200 );
        fSynopsis.setBounds(30, bookSynopsis.getY()+40, 400, 200 );
        synopsis.setViewportView(fSynopsis);

        fSynopsis.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        //Untuk Nama Penulis
        Label penulis = new Label(synopsis.getY()+240, "Penulis Buku");
        TextField fPenulis = new TextField(penulis.getY() + 40);

        //Untuk Tanggal
        Label date = new Label(fPenulis.getY() + 60, "Tanggal Penerbitan Buku");

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(30, date.getY() + 40, 200, 30);

        //Untuk Tombol Kirim
        JButton newBook = new JButton("Tambah Buku");
        newBook.setBounds(30, dateChooser.getY() + 60, 200, 50);
        newBook.setBackground(Color.DARK_GRAY);
        newBook.setForeground(Color.white);

        //Untuk upload gambar
        JButton uploadImage = new JButton("Upload Image");
        uploadImage.setBackground(Color.darkGray);
        uploadImage.setForeground(Color.white);
        uploadImage.setFont(new Font("Poppins", Font.PLAIN, 13));
        uploadImage.setBounds(480, 450, 130, 40);


        uploadImage.addActionListener((event) -> {
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
        });

        ImageIcon cover = new ImageIcon(this.getClass().getResource("../public/image/1655119642474.jpg"));
        Image img = cover.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon cvr = new ImageIcon(img);

        coverDisplay.setIcon(cvr);
        coverDisplay.setBounds(480, 40, 300, 400);

        //Genre
        Label genreTitle = new Label(480, uploadImage.getY() + 60, "Genre");

        JComboBox<String> genre = new JComboBox<>(Genre.genre);
        genre.setBounds(480, genreTitle.getY() + 40, 300, 30);
        genre.setFont(new Font("Poppins", Font.PLAIN, 15));
        genre.setSelectedItem(null);

        //Stok
        Label stokTitle = new Label(480, genre.getY() + 60, "Stok");
        TextField stok = new TextField(480, stokTitle.getY() + 40);

        newBook.addActionListener(new SubmitBook(fPenulis, dateChooser, fBookTitle, fSynopsis, genre, stok));

        content.add(stokTitle);
        content.add(stok);
        content.add(genreTitle);
        content.add(genre);
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


    class SubmitBook implements ActionListener{
        TextField fPenulis;
        JDateChooser dateChooser;
        TextField fBookTitle;
        JTextArea fSynopsis;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        JComboBox<String> genre;
        JTextField stok;


        SubmitBook(TextField fPenulis, JDateChooser dateChooser, TextField fBookTitle, JTextArea fSynopsis, JComboBox<String> genre,
                   JTextField stok){
            this.fPenulis = fPenulis;
            this.dateChooser = dateChooser;
            this.fBookTitle = fBookTitle;
            this.fSynopsis = fSynopsis;
            this.genre = genre;
            this.stok = stok;
        }

        public void actionPerformed(ActionEvent e) {
            int confirmation = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menambah Buku ?",
                    "Book Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(confirmation == 0){
                AddBookController.setNewBook(fBookTitle.getText(), fSynopsis.getText(), fPenulis.getText(), dateFormat.format(dateChooser.getDate()),
                        (String) genre.getSelectedItem(), stok.getText());
                fPenulis.setText("");
                dateChooser.setDate(null);
                fBookTitle.setText("");
                fSynopsis.setText("");
                stok.setText("");
                genre.setSelectedItem(null);

                JOptionPane.showMessageDialog(null, "Buku Sudah Tersimpan");
            }
        }
    }

}
