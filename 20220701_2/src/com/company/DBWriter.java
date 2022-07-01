package com.company;

public abstract class DBWriter {

    public void write(String sstring){
        getJDBCDriver();
        getConnection();
        putRecord(sstring);
        closeConnection();
    }

    protected abstract void getJDBCDriver();

    protected void getConnection(){
        System.out.println("получили connection");
    }
    protected void putRecord(String str){
        System.out.println("записали record:" + str);
    }
    protected void closeConnection(){
        System.out.println("закрыли connection");
    }
}
