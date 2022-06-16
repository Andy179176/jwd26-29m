package com.company;

import java.util.Random;

public class RndArray implements ArrayService {
    Random rnd = new Random(System.currentTimeMillis());


    @Override
    public int[] getArray() {
        int size = rnd.nextInt(30);
        int[] res = new int[size];
        for (int i = 0; i < size ; i++) {
            res[i]= rnd.nextInt();
        }
        return res;
    }
}
