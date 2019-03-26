package com.fabe2ry.sort;

public class BubbleSort {

    public static void sort(int[] array){
        for(int i = 0; i < array.length - 1; i ++){
            for(int j = 0; j < array.length - 1 - i; j ++){
                if(array[j] < array[j + 1]){
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    public static void sortWithRecord(int[] array){
        boolean change = true;
        for(int i = 0; i < array.length - 1 && change; i ++){
            change = false;
            for(int j = 0; j < array.length - 1 - i; j ++){
                if(array[j] < array[j + 1]){
                    change = true;
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 7, 9, 6, 2, 4, 8, 1, 7};
//        BubbleSort.sort(testArray);
        BubbleSort.sortWithRecord(testArray);
        for(int i = 0; i < testArray.length; i ++){
            System.out.print(testArray[i] + " ");
        }
    }

}
