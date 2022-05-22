package com.company;

public class TwoDimensionalArrayHandler {
    int[][] value;

    public TwoDimensionalArrayHandler(int[][] value ){
        this.value= value;
    }


    public int[] getRow(int row){
        if(row>=0&&row<value.length){
            return value[row];
        } else{
            return new int[0];
        }
    }

    public long sum(int[] array){
        long sum=0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public long sum(int i){
        int[] array=getRow(i);
        return sum(array);
    }


    public double avrg(int[] array){
        return (double)sum(array)/array.length;
    }



    public boolean checkRowAvrgPositive(int row){
        return avrg(getRow(row))>0;
    }

}
