package com.fabe2ry.sort;

public class HeapSort {
    public static void sort(int[] array){
        for(int i = array.length / 2 - 1; i >= 0; i --){
            buildMaxHeap(array, i, array.length);
        }
        
        for(int i = array.length - 1; i >= 0; i --){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            buildMaxHeap(array, 0, i);
        }
    }

    private static void buildMaxHeap(int[] array, int i, int length) {
        int temp = array[i];
        int son = i * 2 + 1;
        while(son < length){
            if(son + 1 < length && array[son + 1] > array[son]){
                son ++;
            }

            if(array[son] < temp){
                break;
            }

            array[i] = array[son];
            i = son;
            son = i * 2 + 1;
        }

        array[i] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7, 0, 9, 6, 8, 5, 4, 2};
        HeapSort.sort(array);
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
    }


}
