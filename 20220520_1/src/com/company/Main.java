package com.company;
/*
реализовать метод, который принимает массив int[][] и индекс строки и проверяет,
больше ли среднее значение элементов в строке 0

Реализуйте метод, который принимает двумерный массив и возвращает одномерный массив
со всеми элементами данного массива.
({{1,2},{3,4},{5,6}}) -> {1,2,3,4,5,6}

 */
public class Main {


    public static void main(String[] args) {
	    int[][] arr= {{10,9,8},
                      {-1,-3,1,1},
                      {0,1,2}};

	    TwoDimensionalArrayHandler handler=new TwoDimensionalArrayHandler(arr);
        System.out.println(handler.checkRowAvrgPositive(0));
        System.out.println(handler.checkRowAvrgPositive(1));

        System.out.println(handler.sum(0));
    }
}
