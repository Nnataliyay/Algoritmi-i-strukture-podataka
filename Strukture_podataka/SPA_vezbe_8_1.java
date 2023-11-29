package com.mycompany.spa_vezbe_8_1;

/**
 *
 * @author NATALIJA
 */
public class SPA_vezbe_8_1 {

    public static void main(String[] args) {
        
        DvostrukaLista novaLista = new DvostrukaLista();
        
        System.out.println("Dodajemo 3 cvora na kraj i ispisujemo ih");
        novaLista.dodajNaKraj(5);
        novaLista.dodajNaKraj(10);
        novaLista.dodajNaKraj(15);
        novaLista.show();

        System.out.println("\nDodajemo 2 cvora na pocetak i ispisujemo ih redom a zatim i unazad");
        novaLista.dodajNaPocetak(50);
        novaLista.dodajNaPocetak(150);
        novaLista.show();
        novaLista.showFromBack();

        System.out.println("\nBrisemo poslednji");        
        novaLista.ukloniPoslednji();
        novaLista.show();
        //System.out.println("\n" + novaLista.ukloniPoslednji()); 
        
        
        System.out.println("\nBrisemo prvi");
        novaLista.ukloniPrvi();
        novaLista.show();
        
        System.out.println("\nDodajemo na pozizciju 3");
        novaLista.dodajNaPoziciju(3, 5555);
        novaLista.show();
        
        System.out.println("\nBrisemo sa pozizcije 3");
        novaLista.ukloniSaPozicije(3);
        novaLista.show();
        
        System.out.println("Dodajemo 3 cvora na kraj i ispisujemo ih");
        novaLista.dodajNaKraj(3);
        novaLista.dodajNaKraj(6);
        novaLista.dodajNaKraj(9);
        novaLista.show();
        
        novaLista.ukloniSve();
        novaLista.show();

    }
}
