package com.controller;

import com.models.Books;
import com.views.AddBook;
import com.views.ListBooks;

import java.awt.print.Book;
import java.sql.ResultSet;

public class Controller {

    static ListBooks lsView = new ListBooks();
    static AddBook addBookView = new AddBook();
//AddBook addBookView = new AddBook();
//    static Start start;

    public static void ListBookController(Boolean visible){
        Books books = new Books();
        ResultSet rs = books.getAll();
        lsView.display(rs);
        lsView.setSize(1920, 1080);
    }

    public static void addBookController(Boolean visible){
//        start = addBookView;
//        addBookView.dispose();
//        addBookView.setSize(1920, 1080);
        if(!visible){
            addBookView.hi
        }
        addBookView.setVisible(visible);
    }
}
