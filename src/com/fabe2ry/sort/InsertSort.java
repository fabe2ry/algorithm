package com.fabe2ry.sort;

public class InsertSort {

    public static void sort(int[] array){
        for(int i = 1; i < array.length; i ++){
            if(array[i - 1] > array[i]){
                int temp = array[i];
                int j = i;
                while(j > 0 && array[j - 1] > temp){
                    array[j] = array[j - 1];
                    j --;
                }
                array[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 3, 8, 9, 1};
        InsertSort.sort(array);
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
    }

}
