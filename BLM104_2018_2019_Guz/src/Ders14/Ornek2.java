/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        Path p=Paths.get("C:\\dosyalar\\altKlasör\\enAltKlasor");
        System.out.println(p.getRoot());
        System.out.println(p.getNameCount());
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
    }
}
