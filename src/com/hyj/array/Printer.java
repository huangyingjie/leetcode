package com.hyj.array;

/**
 * Created by huangyingjie on 14-9-18.
 */
public class Printer {
    public int[][] getDiagonalLine (int[][] array) {
        int[][] result = new int[3][];
        for(int i = 0; i < array.length/2; i++) {
            for (int j = array[i].length-1-i; j > array[i].length/2; j--) {
                System.out.println(array[i][j]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        new Printer().getDiagonalLine(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
    }
}
