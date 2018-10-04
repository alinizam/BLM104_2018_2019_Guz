/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02_Lab.Ornek1_2;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class frm_anaEkran extends javax.swing.JFrame {
    ArrayList<Personel> personeller = new ArrayList();
    /**
     * Creates new form frm_anaEkran
     */
    public frm_anaEkran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_adi = new javax.swing.JTextField();
        txt_soyadi = new javax.swing.JTextField();
        txt_birim = new javax.swing.JTextField();
        btn_kayit = new javax.swing.JButton();
        btn_goster = new javax.swing.JButton();
        btn_ara = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_sonuclar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_adi, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 73, 70, -1));
        getContentPane().add(txt_soyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 114, 70, -1));
        getContentPane().add(txt_birim, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 155, 70, -1));

        btn_kayit.setText("KAYIT");
        btn_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_kayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 72, -1, -1));

        btn_goster.setText("GOSTER");
        btn_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gosterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_goster, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 113, -1, -1));

        btn_ara.setText("ARA");
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ara, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 154, -1, -1));

        txta_sonuclar.setColumns(20);
        txta_sonuclar.setRows(5);
        jScrollPane1.setViewportView(txta_sonuclar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 140, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitActionPerformed
        // TODO add your handling code here:
        Personel ypersonel = new Personel();
        ypersonel.adi= txt_adi.getText();
        ypersonel.soyAdi= txt_soyadi.getText();
        ypersonel.birim= txt_birim.getText();
        
        personeller.add(ypersonel);
 
        txt_adi.setText("");
        txt_soyadi.setText("");
        txt_birim.setText("");
        
    }//GEN-LAST:event_btn_kayitActionPerformed

    private void btn_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gosterActionPerformed
        // TODO add your handling code here:
        String sonuc="";
        for (Personel person : personeller) {
            sonuc+= person.adi+" "+person.soyAdi+"\n";
        }
        
        txta_sonuclar.setText(sonuc);
    }//GEN-LAST:event_btn_gosterActionPerformed

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed
        // TODO add your handling code here:
        String sonuc="";
        for (Personel person : personeller) {
            if(person.adi.compareTo(txt_adi.getText())==0)
            {
                sonuc+= person.adi+" "+person.soyAdi+"\n";
            }
        }
        txta_sonuclar.setText(sonuc);
    }//GEN-LAST:event_btn_araActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_anaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_anaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_goster;
    private javax.swing.JButton btn_kayit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_birim;
    private javax.swing.JTextField txt_soyadi;
    private javax.swing.JTextArea txta_sonuclar;
    // End of variables declaration//GEN-END:variables
}
