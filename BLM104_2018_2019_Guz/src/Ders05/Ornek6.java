/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        String s = "a";
        for (int i = 0; i < 50000; i++) {
            s += "a";
        }
        System.out.println("Bitti");
    }
}
