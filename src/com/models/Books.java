package com.models;

import com.queryBuilder.QueryBuilder;
import com.factory.BookMigration;
import java.sql.ResultSet;
import java.util.Dictionary;
import java.util.Hashtable;


public class Books extends QueryBuilder {

    private static String model = "books";
    public String data = "";

    public Books(){
        super(model);
    }

    public ResultSet getAll(){
        ResultSet rs = super.getAll( );
//        try {
//            while (rs.next()){
//                data += rs.getString("name") + " " + rs.getString("genre") + "\n";
////                System.out.println("Here");
//            }
//            System.out.println(data);
//        }catch (Exception e){
//            e.getStackTrace();
//        }
        return rs;
    }

}
