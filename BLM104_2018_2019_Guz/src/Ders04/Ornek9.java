/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        // Metinde ilk ve son a harfi arasında kaç adet boşluk vardır. Bulunuz.
        String s="Fatih 123 Sultan2 Mehmet3 vakıf Üniversitesi5";
        int ilk=s.indexOf("a");
        int son=s.lastIndexOf("a");
        System.out.println(s.substring(ilk,son).split(" ").length-1);
        int sayac=0;
        for (int i = ilk; i < son; i++) {
            if (s.charAt(i)==' ') sayac++;
        }
        System.out.println(sayac);
    }
    
}
