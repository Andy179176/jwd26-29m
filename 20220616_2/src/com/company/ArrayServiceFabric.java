package com.company;

import com.company.ArrayService;
import com.company.ConstArray;
import com.company.RndArray;

public class ArrayServiceFabric {

    public ArrayService getArrayService(int wayNumber){
        switch (wayNumber){
            case 1: return new ConstArray();
            case 2: return new RndArray();
            default:
                System.out.println("Error: unsupport way ");
                return null;
        }
    }

}
