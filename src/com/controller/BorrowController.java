package com.controller;

import com.models.Books;
import com.models.Peminjaman;
import com.views.PeminjamanBuku;

import javax.swing.*;

public class BorrowController {
    static PeminjamanBuku borrowBookView = new PeminjamanBuku();
    public static JPanel display(){
        return borrowBookView.display();
    }
    public static void setPeminjaman(String id_peminjam, String id_buku, String tanggal_peminjaman){
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.values.put("id_buku", id_buku);
        peminjaman.values.put("id_peminjam", id_peminjam);
        peminjaman.values.put("tanggal_peminjaman", tanggal_peminjaman);
        peminjaman.add();

        Books books = new Books();
    }
}
