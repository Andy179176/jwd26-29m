package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    DBWriter mysql= new MySQLWriter();
        DBWriter oracle=new OracleWriter();
        DBWriter mongo=new MongoWriter();
        //mysql.write("mysql write");
        //System.out.println("-------------------------------");
        //oracle.write("oracle write");
        //System.out.println("-------------------------------");
        //mongo.write("mongo write");

        List<DBWriter> writers = new ArrayList<>();
        writers.add(mysql);
        writers.add(oracle);
        writers.add(mongo);
        for (DBWriter w:writers){
            System.out.println();
            w.write("String to write");
        }

    }

}
