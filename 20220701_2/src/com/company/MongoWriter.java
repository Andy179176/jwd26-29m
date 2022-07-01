package com.company;

public class MongoWriter extends DBWriter {
    public void write(String sstring){
        getMongoDriver();
        getConnection();
        putRecord(sstring);
    }

    @Override
    protected void getJDBCDriver() {

    }

    private void getMongoDriver(){
        System.out.println("получили Mongo driver");
    }
}
