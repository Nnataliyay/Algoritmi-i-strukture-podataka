package com.mycompany.spa_vezbe_6_1;

/**
 *
 * @author NATALIJA
 */
public class SPA_vezbe_6_1 {

    public static void main(String[] args) {
        
        QuickSort qs = new QuickSort();
        
        int[] arr = {9, 2, 12, 4, 14, 5, 15};
        
        System.out.println( "Originalan niz: ");
        qs.stampajNiz(arr);
        
        int start = 0;
        int end = arr.length - 1;
        qs.quickSort(arr, start, end);
        
        System.out.println( "Sortirani niz: ");
        qs.stampajNiz(arr);
    }
}
