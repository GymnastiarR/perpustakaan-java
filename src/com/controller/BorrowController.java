package com.controller;

import com.views.PeminjamanBuku;

import javax.swing.*;

public class BorrowController {
    static PeminjamanBuku borrowBookView = new PeminjamanBuku();
    public static JPanel display(){
        return borrowBookView.display();
    }
}
