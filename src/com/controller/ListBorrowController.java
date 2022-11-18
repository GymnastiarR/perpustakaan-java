package com.controller;

import com.views.ListBorrow;
import com.views.PeminjamanBuku;

import javax.swing.*;

public class ListBorrowController {
    static ListBorrow listBorrowView = new ListBorrow();
    public static JPanel display(){
        return listBorrowView.display();
    }
}
