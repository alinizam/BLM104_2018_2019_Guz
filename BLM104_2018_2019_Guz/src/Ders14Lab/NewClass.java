/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author alinizam
 */
public class NewClass {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2018_2019_GuzPU");
        EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select b from Birim b");
         List<Birim> birimler=q.getResultList();
        for ( Birim b : birimler) {
            try {
                Path p=Paths.get("c:","dosyalar",b.getBirimAdi());
                Files.createFile(p);
            } catch (IOException ex) {
                Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
