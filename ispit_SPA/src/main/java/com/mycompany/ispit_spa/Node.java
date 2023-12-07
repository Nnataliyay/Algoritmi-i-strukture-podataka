package com.mycompany.ispit_spa;


public class Node {
    
    int key;
    int grade;
    
    Node left;
    Node right;

    public Node(int key, int grade) {
        this.key = key;
        this.grade = grade;
        
        left = right = null;
    }
    
    
}
