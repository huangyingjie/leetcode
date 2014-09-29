package com.hyj.dp;

/**
 * Created by huangyingjie on 14-9-29.
 */
public class Fib {
    public int getFib(int n) {
        int i_1 = 1, i_2 = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = i_1 + i_2;
            i_2 = i_1;
            i_1 = sum;
            System.out.println(sum);
        }
        return sum;
    }
    public static void main (String[] args) {
        int fib = new Fib().getFib(6);
    }
}
