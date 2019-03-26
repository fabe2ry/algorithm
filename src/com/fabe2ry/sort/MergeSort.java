package com.fabe2ry.sort;

public class MergeSort {

    public static void sort(int[] array){
        int[] temp = new int[array.length];
        int start = 0;
        int end = array.length - 1;
        sort(array, start, end, temp);
    }

    private static void sort(int[] array, int start, int end, int[] temp) {
        if(start < end){
            int mid = (start + end) / 2;
            sort(array, start, mid, temp);
            sort(array, mid + 1, end, temp);
            merge(array, start, mid, end, temp);
        }
    }

    private static void merge(int[] array, int start, int mid, int end, int[] temp) {
        int i = start;
        int j = mid + 1;
        int t = 0;
        while(i <= mid && j <= end){
            if(array[i] <= array[j]){
                temp[t ++] = array[i ++];
            }else{
                temp[t ++] = array[j ++];
            }
        }

        while(i <= mid){
            temp[t ++] = array[i ++];
        }

        while(j <= end){
            temp[t ++] = array[j ++];
        }

        t = 0;
        for(i = start; i <= end; i ++){
            array[i] = temp[t ++];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{7, 9, 8, 7, 5, 6};
        MergeSort.sort(array);
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
    }
}
