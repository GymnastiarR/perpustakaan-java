
package com.factory;

import java.util.LinkedList;

public class StaffMigration extends Migration{

  static LinkedList<Field> fields = new LinkedList<>();

  StaffMigration (){
      super("Staff", fields);
  }

  @Override
  public void tableBuilder() {
    //Create field
    Field nameStaff = new Field();
    //Name of field
    nameStaff.name = "name";
    //Type of field
    nameStaff.type = "varchar";
    nameStaff.size = 255;
    fields.add(nameStaff);

    //You can add another field
    Field age = new Field();
    age.name = "age";
    age.type = "int";
    fields.add(age);
//    age.size;
  }
}

