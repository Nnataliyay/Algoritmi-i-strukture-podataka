package com.mycompany.ispit_spa;


public class Ispit_SPA {

    public static void main(String[] args) {
        
        BST ucenici = new BST();
        
        //add radi
        ucenici.add(6, 8);
        ucenici.add(1, 9);
        ucenici.add(9, 7);
        ucenici.add(3, 6);
        ucenici.add(5, 5);
        ucenici.add(4, 5);
        ucenici.add(2, 10);
        
        //print radi
        ucenici.printInorder(ucenici.root);
        System.out.println();
        
        //remove po kljucu radi
        System.out.println("Brisanje ucenika sa sifrom 1");
        ucenici.remove(1);
        ucenici.printInorder(ucenici.root);
        
        //radi sve osim funkcije koja broji cvorove
        System.out.println();
        ucenici.showAverage(ucenici.root);
        
        System.out.println();
        ucenici.showBestGrade(ucenici.root);
    }
}
