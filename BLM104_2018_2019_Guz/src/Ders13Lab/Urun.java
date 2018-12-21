/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alinizam
 */
@Entity
@Table(name = "URUN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Urun.findAll", query = "SELECT u FROM Urun u")
    , @NamedQuery(name = "Urun.findByUrunId", query = "SELECT u FROM Urun u WHERE u.urunId = :urunId")
    , @NamedQuery(name = "Urun.findByToplamAdet", query = "SELECT u FROM Urun u WHERE u.toplamAdet = :toplamAdet")})
public class Urun implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "URUN_ID")
    private String urunId;
    @Column(name = "TOPLAM_ADET")
    private Integer toplamAdet;

    public Urun() {
    }

    public Urun(String urunId) {
        this.urunId = urunId;
    }

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public Integer getToplamAdet() {
        return toplamAdet;
    }

    public void setToplamAdet(Integer toplamAdet) {
        this.toplamAdet = toplamAdet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urunId != null ? urunId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Urun)) {
            return false;
        }
        Urun other = (Urun) object;
        if ((this.urunId == null && other.urunId != null) || (this.urunId != null && !this.urunId.equals(other.urunId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13Lab.Urun[ urunId=" + urunId + " ]";
    }
    
}
