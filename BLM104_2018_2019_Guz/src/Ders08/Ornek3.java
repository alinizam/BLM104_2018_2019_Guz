/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        try {
              Scanner s=new Scanner(System.in);
              System.out.println("Bir say? giriniz");
              int bolunen=s.nextInt();
              System.out.println("Bir say? saha giriniz");
              int bolen=s.nextInt();
      
             System.out.println(bolunen/bolen);
             System.out.println("Devam");
             System.out.println("Basarili bitti");
        } 
        catch (ArithmeticException e) {
            System.out.println("Sayi sifira bolunemez."+e.getMessage());
        }
         catch (NumberFormatException e) {
             System.out.println("Sayi sifira bolunemez." + e.getMessage());
        }
       
    }
}
