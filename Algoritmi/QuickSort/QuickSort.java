package dan06quicksort;

public class QuickSort { 
    
    
    public void stampajNiz(int [] arr){
        for(int i : arr){
        
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public int particionisanje(int[] arr, int start, int end) {

        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;

            }

        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;

    } 
    
    public void quickSort(int [] arr, int start, int end){
    
        int pivot = particionisanje(arr, start, end); 
        
        
        if(pivot - 1 > start) 
            quickSort(arr, start, pivot - 1); 
        if (pivot + 1 < end) 
            quickSort(arr, pivot + 1, end);
    }

}
