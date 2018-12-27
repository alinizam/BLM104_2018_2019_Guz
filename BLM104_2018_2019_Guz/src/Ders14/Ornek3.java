/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek3 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:\\dosyalar\\b");
        Path pHedef=Paths.get("c:\\dosyalar\\a\\1");
        
        System.out.println(p.getRoot());
       // p.toRealPath();
        System.out.println(p.isAbsolute());
        System.out.println(p.toUri());
        System.out.println(p.relativize(pHedef));
        System.out.println("------------");
        for(Path yol:p){
            System.out.println(yol);
        } 
    }
}
