package com.controller;
import com.models.Books;
import com.views.ListBooks;

import javax.swing.*;
import java.sql.ResultSet;

public class ListViewController {
        static Books books = new Books();
        static ListBooks listBookView = new ListBooks();
        public static void display(){
            ResultSet rs = books.getAll();
//            listBookView.display(rs);
//            return listBookView.display(rs);
        }

}
