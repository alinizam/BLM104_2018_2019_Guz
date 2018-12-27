/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek7 {
    public static void main(String[] args) throws IOException {
        Path filename = Paths.get("c:", "dosyalar" );
        Files.delete(filename);
        System.out.println(Files.exists(filename));
        
    }
}
