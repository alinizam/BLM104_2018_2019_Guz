/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        String s="1Fatih1 2Sultan2 1Mehmet V 43";
        System.out.println(s.split(" ").length);
        Random r=new Random();
        int rasgeleKelime=r.nextInt(s.split(" ").length);
        System.out.println(s.split(" ")[rasgeleKelime]);
    }
}
