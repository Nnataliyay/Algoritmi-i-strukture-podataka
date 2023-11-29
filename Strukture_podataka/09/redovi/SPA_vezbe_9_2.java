/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spa_vezbe_9_2;

/**
 *
 * @author NATALIJA
 */
public class SPA_vezbe_9_2 {

    public static void main(String[] args) {
        
        RedZaCekanje red = new RedZaCekanje(6);
        
        System.out.println("\nPunimo red za cekanje i prikazujemo clana na redu");
        red.enQueue(3);
        red.enQueue(6);
        red.enQueue(9);
        red.enQueue(12);
        red.enQueue(15);
        red.enQueue(18);
        red.peekFront();
        
        System.out.println("\nVadimo clan i prikazujemo prvog na redu");
        red.deQueue();
        red.peekFront();
    }
}
