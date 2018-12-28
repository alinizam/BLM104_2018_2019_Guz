/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Soru1 {
    public static void main(String[] args) {
        String metin ="Fatih1 Sultaaan2 Mehmmmet68 vakif4 Unnniversitesi9 Ahmet";
        //a
        
        for (int i = 0; i < metin.length()-2; i++) {
            if (metin.charAt(i)==metin.charAt(i+1) 
                  && metin.charAt(i+1)==metin.charAt(i+2))
                System.out.println(i);
        }
        //b
        
        Pattern p=Pattern.compile("[A-z]+[A-z]{6}[0-9]+");
        Matcher m=p.matcher(metin);
        while (m.find()){
            System.out.println(m.group());
        }
        
        StringBuilder sb=new StringBuilder(metin);
        int i=0;
        while(i<sb.length()-2) {
            if (sb.charAt(i)==sb.charAt(i+1)
                  && sb.charAt(i+1)==sb.charAt(i+2)){
                sb.delete(i, i+3);
            }
            i++;
        }
         System.out.println(sb);
        
    }
}
