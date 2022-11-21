package com.controller;

import com.models.Books;
import com.views.AddBook;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import javafx.*;

public class AddBookController {
    static AddBook view = new AddBook();
    public static JPanel display(){
        return view.display();
    }

    public static void setNewBook(String title, String synopsis, String penulis, String tanggal_terbit, String genre, String stok){
        Books newBook = new Books();
        newBook.values.put("name", title);
        newBook.values.put("synopsis", synopsis);
        newBook.values.put("penulis", penulis);
        newBook.values.put("tanggal_terbit", tanggal_terbit);
        newBook.values.put("genre", genre);
        newBook.values.put("stok", stok);

        newBook.add();
    }

    public static void joinBook(){
        Books book = new Books();
//        book.query("SELECT * FROM BOOK JOIN")
    }

}
