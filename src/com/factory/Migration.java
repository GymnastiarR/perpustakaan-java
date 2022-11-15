
package com.factory;

import com.connect.ConnectConfig;

import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

abstract public class Migration{

  Statement stmt;

  Migration (String tableName, LinkedList<Field> fields){
    tableBuilder();
    try{
      ConnectConfig.connect();
      stmt = ConnectConfig.conn.createStatement();

      String query = "CREATE TABLE " + tableName + " (id int NOT NULL AUTO_INCREMENT, PRIMARY KEY (id))";
      stmt.executeUpdate(query);

      Iterator it = fields.iterator();

      while (it.hasNext()){
        Field field = (Field) it.next();
        query = "ALTER TABLE " + tableName + " ADD " + field.name + " " + field.type + "(" +  field.size + ");";
        stmt.executeUpdate(query);
//        System.out.println(field.name);
      }
    }catch (Exception e){
      e.printStackTrace();
    }


  }

  abstract public void tableBuilder();
}

