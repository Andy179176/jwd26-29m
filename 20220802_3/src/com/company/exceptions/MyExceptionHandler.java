package com.company.exceptions;

public class MyExceptionHandler extends RuntimeException {
    private String myMsg;

    public MyExceptionHandler(String myMsg) {
        this.myMsg = myMsg;
    }

    public void print(){
        System.out.println(myMsg);
    }

}
