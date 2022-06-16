package com.company;

public class ConstArray implements ArrayService {
    @Override
    public int[] getArray() {
        return new int[]{7,3,2,5,6,2};
    }
}
