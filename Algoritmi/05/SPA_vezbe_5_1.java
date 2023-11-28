package com.mycompany.spa_vezbe_5_1;


public class SPA_vezbe_5_1 {

    public static void main(String[] args) {
        
        MergeSort ms = new MergeSort();
        
        int[] arr = {4, 12, 16, 1, 5, 22 , 2};
        
        System.out.println("Originalan niz: ");
        ms.printArr(arr);
        
        arr = ms.mergeSort(arr);
        System.out.println("Sortirani niz: ");
        ms.printArr(arr);
    }
}
