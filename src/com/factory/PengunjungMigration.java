
package com.factory;

import java.util.LinkedList;

public class PengunjungMigration extends Migration{

  public static LinkedList<Field> fields = new LinkedList<>();

  PengunjungMigration (){
      super("Pengunjung", fields);
  }

  @Override
  public void tableBuilder() {
    //Create field
    Field nama = new Field();
    //Name of field
    nama.name = "name";
    //Type of field
    nama.type = "varchar";
    //size of field
    nama.size = 255;
    //add field
    fields.add(nama);



    //You can add another field
  }
}

