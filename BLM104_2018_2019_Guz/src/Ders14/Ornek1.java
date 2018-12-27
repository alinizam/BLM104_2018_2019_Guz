/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) throws FileNotFoundException {
        String dosya="c:\\dosyalar\\personel.txt";
        PrintWriter f=new PrintWriter(dosya);
        f.format("%30s %10d %.2f \n","Ahmet AK",2000,1.0);
        f.format("%30s %10d \n","Abdullah AKOĞLU",5200000);
        f.format("%30s %10d \n","Ayşe Yeşil",500000);
        f.close();
    }
}

