/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09.Ornek5;

/**
 *
 * @author anizam
 */
public class stokHata extends RuntimeException {
    int kalanMalzeme;

    public stokHata(int kalanMalzeme) {
        this.kalanMalzeme = kalanMalzeme;
    }
    
}
