package com.company;

import java.util.List;

public class UserCreateException extends IllegalArgumentException {
    private List<String> errList;

    public UserCreateException(List<String> errList){
        this.errList=errList;
    }

    public void printErrorsList(){
        System.err.println("User create error:");
        for (String s:errList) {
            System.err.println("  "+ s);
        }
    }
}
