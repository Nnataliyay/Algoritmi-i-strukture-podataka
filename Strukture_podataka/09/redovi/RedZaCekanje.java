package com.mycompany.spa_vezbe_9_2;

/**
 *
 * @author NATALIJA
 */
public class RedZaCekanje {
    
    int maxSize;
    int arr[];
    int front;
    int rear;
    int nItems;
    
    public RedZaCekanje(int n){
        maxSize = n;
        arr = new int[maxSize];
        
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void enQueue(int data){
        if(rear == maxSize - 1){
            rear = -1;
        }
        
        arr[++rear] = data; //prvo inkrementira pa onda dodeljuje vrednost 
        System.out.println("Dodat je element " + data);
        nItems++;
    }
    
    public int deQueue(){
        int temp = arr[front++]; //prvo dodeli vrednost a onda inkrementiraj
        
        if(front == maxSize){
            front = 0;
        }
        
        System.out.println("Uklonjen je element " + temp);
        nItems--;
        return temp;
    }
    
    public void peekFront(){
        System.out.println("Na pocetku reda je element " + arr[front]);
    }

    public boolean isEmpty(){
        return nItems == 0;
    }
    public boolean isFull(){
        return nItems == maxSize;
    }
    
    public int size(){
        return nItems;
    }
    
    
}
