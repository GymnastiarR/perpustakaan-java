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
    static String path = "src/com/public/image/1655119642474.jpg";
    public static JPanel display(){
//        ImageIcon cvr = new ImageIcon();
//        try {
//            BufferedImage myPicture = ImageIO.read(new File(path));
//            ImageIcon coverBook = new ImageIcon(myPicture.getScaledInstance(300, 400, Image.SCALE_SMOOTH));
//            cvr = coverBook;
//            return view.display(coverBook);
//        }catch (IOException e){
//
//        }
        return view.display();
    }

    public static void setNewBook(String title, String synopsis){
        Books newBook = new Books();
        newBook.values.put("name", title);
        newBook.values.put("synopsis", synopsis);
        newBook.add();
    }

    public static void joinBook(){
        Books book = new Books();
//        book.query("SELECT * FROM BOOK JOIN")
    }

}
