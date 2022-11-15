package com.factory;


import java.util.LinkedList;

public class BookMigration extends Migration{

    public static LinkedList<Field> fields = new LinkedList<>();

    BookMigration(){
        super("Books", fields);
    }

    @Override
    public void tableBuilder() {
        Field bookName = new Field();
        bookName.name = "name";
        bookName.type = "varchar";
        bookName.size = 255;
        fields.addLast(bookName);

        Field bookGenre = new Field();
        bookGenre.name = "genre";
        bookGenre.type = "varchar";
        bookGenre.size = 255;
        fields.addLast(bookGenre);


//        for (Field x : fields){
//            System.out.println(x.name);
//        }
//        System.out.println();
    }
}
