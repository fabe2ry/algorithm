package com.fabe2ry.sort;

public class ShellSort {

    public static void sort(int[] array){
        for(int gap = array.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i ++){
                if(array[i - gap] > array[i]){
                    int j = i;
                    int temp = array[i];
                    while(j - gap >= 0 && array[j - gap] > temp){
                        array[j] = array[j - gap];
                        j -= gap;
                    }
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort1(int[] array){
        for(int gap = array.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i ++){
                int j = i;
                while(j - gap >= 0 && array[j - gap] > array[j]){
                    int t = array[j - gap];
                    array[j - gap] = array[j];
                    array[j] = t;
                    j -= gap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,4,2,7,9,8,3,6};
//        ShellSort.sort(array);
        ShellSort.sort1(array);
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
    }
}
