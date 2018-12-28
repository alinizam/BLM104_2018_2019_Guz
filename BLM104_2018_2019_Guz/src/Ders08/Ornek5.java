/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        try {
           int dizi[]=new int[3];
           dizi[4]=0;
           Object o=null;
           System.out.println(o.toString());
           int a=3/0;
        }  
        catch (ArithmeticException e) {
            System.out.println("Sıfıra bolme hatasi"+e.getClass());
        }catch (NullPointerException e){
            System.out.println("Obje oluşmadı hatası"+e.getClass());
        }catch (Exception e){
            System.out.println("Bilinmeyen hata"+e.getClass());
        }

//NullPointerException        
    }
}
