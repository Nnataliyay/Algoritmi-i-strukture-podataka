package com.mycompany.ispit_spa;


public class BST {
    
    Node root;

    public BST() {
        root = null;
    }
    
    public Node search(int key){
        
        Node current = root;
        
        while(current != null){
            if(key < current.key){
                current = current.left;
            }else if(key > current.key){
                current = current.right;
            }else{//pronadjen
                break;
            }
        }
        
        return current;
    }
    
    public void add(int newKey, int grade){
        
        if(root == null){
            root = new Node(newKey, grade);
        }else{
            Node current = root;
            while(true){
                if(newKey < current.key){
                    if(current.left == null){
                        current.left = new Node(newKey, grade);
                        break;
                    }else{
                        current = current.left;
                    }
                }else if(newKey > current.key){
                    if(current.right == null){
                        current.right = new Node(newKey, grade);
                        break;
                    }else{
                        current = current.right;
                    }
                }else{
                    System.out.println("\nUneti ucenik postoji!");
                    break;
                }
            }
        }
        
    }
    
    //samo print
    public void printInorder(Node node){
        
        if(node == null){
            return;
        }
        printInorder(node.left);
        System.out.println("Ucenik sifre " + node.key + " ima ocenu " + node.grade);
        printInorder(node.right);
    }
    
    Node bestGrade = new Node(0, 0);
    public Node bestGrade(Node node){
        
        if(node == null){
            return null;
        }
        if( node.grade >= bestGrade.grade){
            bestGrade = node;
        }
        bestGrade(node.left);
        bestGrade(node.right);
        
        return bestGrade;
    }
    
    public void showBestGrade(Node node){
        Node winner = bestGrade(node);
        System.out.println("\nNajvisu ocenu ima ucenik sa sifrom " + winner.key);
    }
    
    //sumira ocene
    int SUM = 0;
    public void gradeSum(Node node){
        if(node == null){
            return;
        }
        gradeSum(node.left);
        SUM += node.grade;
        gradeSum(node.right);
    }
    
    int studSum = 1;
    //sumira studente
    public void studentNumber(Node node){
        
        
        studentNumber(node.left);
        studSum += 1;
        studentNumber(node.right);
    }
    
    public void showAverage(Node node){
        gradeSum(node);
        double gradeAverage = SUM/studSum;
        System.out.println("\nThe grade average is: " + gradeAverage);
        
    }
    
    
public Node removeNode(Node deleteNode) {

        if (deleteNode.left != null && deleteNode.right != null) {
            Node w = deleteNode.right; 
            Node u = null;  
            while (w.left != null) {
                u = w;
                w = w.left;
            }
            deleteNode.key = w.key;
            if (u == null) 
            {
                deleteNode.right = w.right;
            } else {
                u.left = w.right;
            }
        } else 
        if (deleteNode.left != null) {
            deleteNode = deleteNode.left;
        } else {
            deleteNode = deleteNode.right;
        }
        return deleteNode;
    }

public void remove(int deleteKey) {

        Node current = root;
        while (current != null) {
            if (deleteKey < current.key) {
                if (current.left != null && current.left.key == deleteKey) {
                    current.left = removeNode(current.left);
                } else {
                    current = current.left;
                }
            } else if (deleteKey == current.key) {
                root = removeNode(current);
                break;
            } else 
            if (current.right != null && current.right.key == deleteKey) {
                current.right = removeNode(current.right);
            } else {
                current = current.right;
            }
        }
    }
    
    
}
