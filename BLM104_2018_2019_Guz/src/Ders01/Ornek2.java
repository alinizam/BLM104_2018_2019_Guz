/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        JFrame ekranim = new JFrame("Merhaba");
        ekranim.setVisible(true);
        
        JButton butonum=new JButton("Dünya");
        ekranim.add(butonum);
    }
}
