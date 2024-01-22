
package dan05mergesort;

public class MergeSort { 
    
    
    void printArr(int [] arr){
        for(int i:arr){
            System.out.print(i +" ");
        } 
        System.out.println("");
    } 
    
    
      int [] mergeSort(int [] arr){
    
        if(arr.length <= 1){
            return arr;
        
        } 
        int midpoint = arr.length/2;
        int [] levi = new int[midpoint];  
        int [] desni; 
        
        if (arr.length % 2 == 0){
            desni = new int[midpoint];
        }else{
            desni = new int [midpoint + 1];
        } 
		
        for (int i = 0; i < midpoint; i++) {
            levi[i] = arr[i];
        } 
        for (int j = 0; j <desni.length; j++) {
            desni[j] = arr[midpoint + j]; 
            
        } 
        int [] result = new int [arr.length]; 
        
        levi = mergeSort(levi); 
        desni = mergeSort(desni); 
        
        result = merging(levi, desni); 
        return  result;
        
    } 
    
    
     int [] merging(int [] levi, int [] desni) {
        int [] rezultat = new int[levi.length + desni.length]; 
        
        int leviPokazivac, desniPokazivac, rezultatPokazivac; 
        
        leviPokazivac = desniPokazivac = rezultatPokazivac  = 0; 
        
        while(leviPokazivac < levi.length || desniPokazivac < desni.length){
            if(leviPokazivac < levi.length && desniPokazivac < desni.length){
                if(levi[leviPokazivac] <= desni[desniPokazivac]){
                    rezultat[rezultatPokazivac++] = levi[leviPokazivac++];
                
                }else  
                    rezultat[rezultatPokazivac++] = desni[desniPokazivac++];
            
            }else if (leviPokazivac < levi.length){ 
                rezultat[rezultatPokazivac++] = levi[leviPokazivac++]; 
            }else if(desniPokazivac < desni.length){ 
                rezultat[rezultatPokazivac++] = desni[desniPokazivac++];
        }  
        }
        
        return rezultat;
    
    }
    
}
