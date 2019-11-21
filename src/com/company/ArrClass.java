package com.company;

public class ArrClass {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6, 4};
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++){
            for (int j = 0; j < arrLength-i; j++){
                if (arr[i] > arr[j+i]){
                    int val = arr[i];
                    arr[i] = arr[j+i];
                    arr[j+i] = val;
                }
            }
        }
        printArr(arr);
    }

    static void printArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}
