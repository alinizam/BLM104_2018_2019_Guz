/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        System.out.println("Main çalıştı");
        birMetot();
        System.out.println("Main basarılı bitti.");
    }

    static void birMetot() {
        System.out.println("Bir metot çalıştı");
        try {
            ikiMetot();
            System.out.println("Bir metot basarili bitti");
        } catch (Exception e) {
            System.out.println("Bir metot yakalad?");
        }
    }

    static void ikiMetot() {
        System.out.println("En alt metot  çalıştı");
        int i = 1 / 0;
        System.out.println("En alt metot basarili bitti");

    }

}
