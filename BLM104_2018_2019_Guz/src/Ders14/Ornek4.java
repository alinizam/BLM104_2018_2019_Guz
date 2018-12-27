/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author alinizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.{txt,java}");

        Path filename = Paths.get("c:", "dosyalar", "a.java");

        if (matcher.matches(filename)) {
            System.out.println(filename);
        }

    }
}
