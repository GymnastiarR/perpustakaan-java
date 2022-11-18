package com.models;

import com.queryBuilder.QueryBuilder;


public class Staff extends QueryBuilder {

    private static String model = "staff";
    public String data = "";

    public Staff(){
        super(model);
    }

}
