package com.hyj.dp;

/**
 * Created by huangyingjie on 14-9-17.
 */
public class CoinCounter {
    public Integer getPlan(Integer total) {
        Integer[] coins = new Integer[] {1,3,5};
        Integer[] plan = new Integer[total+1];
        for(int i = 0; i <= total; i++) {
            plan[i] = Integer.MAX_VALUE;
            if (i == 0) {
                plan[i] = 0;
            }
            for (int coin : coins) {
                if (coin <= i && plan[i] > plan[i - coin] + 1) {
                    plan[i] = plan[i - coin] + 1;
                }
            }
        }
        return plan[total];
    }
    public static void main (String[] args) {
        Integer plan = new CoinCounter().getPlan(57);
        System.out.println(new StringBuilder("最少需要").append(plan).append("枚硬币"));
    }
}