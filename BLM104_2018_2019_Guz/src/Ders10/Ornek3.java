/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    //Id'si 10 'dan büyük olan kişilerin maaşlarını 10000 yapiniz.
    public static void main(String[] args) {
          String adres="jdbc:derby://localhost:1527/sample";
        try(Connection con=DriverManager.getConnection(adres, "app","app")){
            String sqlSorgu="UPDATE personel "
                    + " SET maas=?"
                    + " WHERE personel_id>=?";
            PreparedStatement s=con.prepareStatement(sqlSorgu);
            int maas=2500, id=6;
            s.setInt(1, maas);
            s.setInt(2, id);
            System.out.println(sqlSorgu);
            int kayitSayi=s.executeUpdate();
            System.out.println("kayitSayi = "+kayitSayi);
        }catch(Exception e){
            System.out.println("Hata "+e.getMessage());
        }
    }
}
