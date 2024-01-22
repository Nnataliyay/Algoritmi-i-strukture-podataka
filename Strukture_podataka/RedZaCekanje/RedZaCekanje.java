
package redzacekanje;


public class NasRedZaCekanje { 
    
    int maxSize; 
    int arr[]; 
    int front; 
    int rear; 
    int nItems; 
    
    public NasRedZaCekanje(int n){
        
        maxSize = n; 
        arr = new int [maxSize]; 
        front = 0; 
        rear = -1; 
        nItems = 0;
    } 
    
    
    public void enQueue(int data){
        if(rear == maxSize - 1) 
            rear = - 1;
        
        arr[++rear] = data; // prvo inkrementuj pa onda dodaj data 
        System.out.println("Dodat je element " + data); 
        nItems++;
    } 
    
    public int deQueue() {
        int temp = arr[front++]; // prvo uzmi data a tek onda inkrementuj 
        
        
        if(front == maxSize) 
            front = 0;
        
        System.out.println("Uklonjen je " + temp); 
        nItems--; 
        return temp;
    } 
    
    public void peekFront(){
        System.out.println("Element na pocetku reda je  " + arr[front]); 
        
    
    }
    
    
    public boolean isEmpty() {
        return nItems == 0; 
    } 
    
    public boolean isFull() {
        return nItems == maxSize;
    
    } 
    
    public int size() {
        return nItems;
    
    }
    
    
}

