package com.hyj.array;

/**
 * 沿对角线打印数组
 * Created by huangyingjie on 14-9-18.
 */
public class Printer {
    public int[][] getDiagonalLine (int[][] array) {
        int[][] result = new int[3][];
        for (int k = array.length - 1; k >= 0 ; k--) {
            for (int i = 0; i < array.length-k; i++) {
                int j = i + k;
                if (j < array[i].length) {
                    System.out.print(array[i][j] + " ");
                }
                if (j == array[i].length - 1) {
                    System.out.print("\n");
                }
            }
        }
        for (int k = 1; k < array.length; k++) {
            for (int i = k; i < array.length; i++) {
                int j = i - k;
                System.out.print(array[i][j] + " ");
                if (i == array.length - 1) {
                    System.out.print("\n");
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        new Printer().getDiagonalLine(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        });
    }
}
