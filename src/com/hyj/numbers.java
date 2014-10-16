package com.hyj;

/**
 * Created by huangyingjie on 14-10-16.
 */
public class Numbers {
    public Integer getSingleNumber(int[] array) {
        if (array == null) {
            return null;
        }
        int singleNumber = 0;
        for (int i = 0; i < array.length; i++) {
            singleNumber = singleNumber ^ array[i];
        }
        return singleNumber;
    }
}
