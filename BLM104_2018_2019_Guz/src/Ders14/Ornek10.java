/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek10 {
    //Bir klasörün altındaki dosyaları ve klasöreri bulmak
    public static void main(String[] args) throws IOException {
        Path kaynak = Paths.get("c:", "dosyalar" );
        DirectoryStream<Path> stream = Files.newDirectoryStream(kaynak);
        for (Path path : stream) {
            System.out.println(path);
        }
    }
}
