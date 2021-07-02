package com.company;

public class Main {
    static void sroting(int[] arr, int i, int len,int j){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        if(j == len - 2){
            j = -1;
            i++;
        }
        if(i == len-1){
            return;
        }
        sroting(arr, i, len, j+1);
    }
    static void bubbleSortUsingRecursion(int[] arr){
        int len = arr.length;
        sroting(arr, 0, len, 0);
    }
    public static void main(String[] args) {
       int[] arr = {10,5,-2,6,12,16,17,15,-2,79,8,53,0};
        bubbleSortUsingRecursion(arr);
        for (int temp:arr) {
            System.out.println(temp);
        }
    }
}
