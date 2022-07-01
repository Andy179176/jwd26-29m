package com.company;

public class OracleWriter extends DBWriter {

    protected void getJDBCDriver(){
        System.out.println("получили Oracle JDBC driver");
    }


}
