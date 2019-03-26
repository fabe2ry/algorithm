package com.fabe2ry.sort;

public class SelectSort {

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i ++){
            for(int j = i + 1; j < array.length; j ++){
                if (array[i] < array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
