package com.fabe2ry.sort;

import java.util.Random;

public class QuickSort {

    public static void sort(int[] array){
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left < right){
            int index = partition(array, left, right);
            quickSort(array, left, index - 1);
            quickSort(array, index + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        if(left > right || right > array.length){
            throw new IllegalArgumentException();
        }

        Random random = new Random();
        int randomIndex = left + random.nextInt(right - left + 1);

        int t = array[right];
        array[right] = array[randomIndex];
        array[randomIndex] = t;

        int small = left - 1;
        for(int i = left; i < right; i ++){
            if(array[i] < array[right]){
                small ++;
                if(small != i){
                    int temp = array[small];
                    array[small] = array[i];
                    array[i] = temp;
                }
            }
        }

        small ++;
        t = array[right];
        array[right] = array[small];
        array[small] = t;

        return small;
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 9, 3, 4, 2, 8};
        QuickSort.sort(array);
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
    }


}
