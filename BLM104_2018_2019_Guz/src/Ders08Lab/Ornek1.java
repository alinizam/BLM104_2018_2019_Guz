/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        String s[] = {"1", "6", "1g", "10", "d"};

        for (int i = 0; i < s.length; i++) {
            try {
                int sayi = Integer.parseInt(s[i]);
                System.out.println("Doğru sayı = " + s[i]);
            } catch (Exception e) {
                System.out.println("Hatalı sayı Çıktı "+s[i]);
            }
        }

    }
}
