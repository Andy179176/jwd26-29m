package com.company;

public class MySQLWriter extends DBWriter {

    protected void getJDBCDriver() {
        System.out.println("получили MySQL JDBC driver");
    }


}
