package com.mycompany.spa_vezbe_6_1;

/**
 *
 * @author NATALIJA
 */
public class QuickSort {
    
    public void stampajNiz(int[] arr){
        for(int i: arr){
            System.out.print( i + " ");
        }
        System.out.println("");
    }
    
    public int particionisanje(int[] arr, int start, int end){
        
        //za pivot uzimamo vrednost na kraju niza
        int pivot = arr[end];
        
        //prolazimo kroz ceo niz
        for(int i = start; i < end; i++ ){
            //poredimo brojeve na poziciji "i" sa pivotom i ukoliko su manji 
            //stavljamo ih na start poziciju tj na levi pokazivac i inkrementiramo ga
            if(arr[i] < pivot){
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }
        
        //na kraju pomeramo pivot na poziciju levog pokazivaca jer je sve sa 
        //desne strane te pozicije vece od pivota koji stoji na samom kraju
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
        
        
        return start;
    }
    
    public void quickSort(int[] arr, int start, int end){
        
        
        int pivot = particionisanje(arr, start,end);
        
        //rekurzivno pozivamo quick sort, prvo od pocetka do pozicije pred 
        //pivot(ukljucujuci tu poziciju) a zatim od pozicije posle 
        //pivota(ponovo ukljucujuci tu poziciju) sve do kraja
        if(pivot - 1 > start){
            quickSort(arr, start, pivot - 1);
        }
        if(pivot + 1 < end){
            quickSort(arr, pivot + 1, end);
        }
    }
}
