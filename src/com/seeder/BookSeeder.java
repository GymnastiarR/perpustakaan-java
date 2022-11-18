package com.seeder;
import com.models.Books;

public class BookSeeder {
    public static void main(String[] args) {
        Books book = new Books();
        book.values.put("name", "Aku Bukan Dia");
        book.values.put("penulis", "APAAJA");
        book.values.put("synopsis", "romance");
        book.add();

        book.values.put("name", "Dia Milikku");
        book.values.put("synopsis", "romance");
        book.values.put("penulis", "Apaantuh");
        book.add();
    }
}
