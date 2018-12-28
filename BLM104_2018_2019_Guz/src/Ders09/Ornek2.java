/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        FileWriter f=null;
        try {
            f=new FileWriter("c:\\dosyalar\\Merhaba.txt");
            f.write("Merhaba");
            return;
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                f.close();
                System.out.println("Çalıştı");
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
