/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek5;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        try {
            Ambar a=new Ambar();
            a.varolanMalzemeAdet=10;
            a.satisYap(20);
            System.out.println(a.varolanMalzemeAdet);   
        } catch (stokHata e) {
            System.out.println(e.kalanMalzeme +" kadar malzeme eksiği var.");
        }
       
    }
}
