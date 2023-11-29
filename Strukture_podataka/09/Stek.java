package com.mycompany.spa_vezbe_9_1;

/**
 *
 * @author NATALIJA
 */
public class Stek {
    
    int maxSize;
    int top;
    int arr[];
    
    public Stek(int n){
        maxSize = n;
        arr = new int[maxSize];
        top = 0;
    }
    
    public boolean isEmpty(){
        return top == 0;
    }
    
    public void show(){
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
    
    public void push(int data){
        if(top < maxSize){
            arr[top] = data;
            top++;
        }else{
            System.out.println("Stek je popunjen");
        }
    }
    
    public int pop(){
        int temp;
        top--;
        temp = arr[top];
        arr[top] = 0;
        
        return temp;
    }
    
    public int peek(){
        int temp;
        temp = arr[top - 1];
        
        return temp;        
    }
}
