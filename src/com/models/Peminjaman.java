package com.models;

import com.queryBuilder.QueryBuilder;
import com.factory.BookMigration;
import java.sql.ResultSet;
import java.util.Dictionary;
import java.util.Hashtable;


public class Peminjaman extends QueryBuilder {

    private static String model = "peminjaman";
    public String data = "";

    public Peminjaman(){
        super(model);
    }

}
