package com.mycompany.spa_vezbe_9_1;

/**
 *
 * @author NATALIJA
 */
public class SPA_vezbe_9_1 {

    public static void main(String[] args) {
        
        Stek stek = new Stek(5);
        
        System.out.println("\nPopunjavanje i prikaz steka");
        stek.push(3);
        stek.push(6);
        stek.push(9);
        stek.push(12);
        stek.push(15);
        stek.show();
        System.out.println("\n\nPokusaj dodavanja preko limita");
        stek.push(99);
        
        System.out.println("\nPrikaz steka");
        stek.show();
        
        System.out.println("\n\npop");
        stek.pop();
        stek.show();
        
        System.out.println("\n\nVrh steka je: " + stek.peek());
    }
}
