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
@Table(name = "FATURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fatura.findAll", query = "SELECT f FROM Fatura f")
    , @NamedQuery(name = "Fatura.findByFId", query = "SELECT f FROM Fatura f WHERE f.fId = :fId")
    , @NamedQuery(name = "Fatura.findByUId", query = "SELECT f FROM Fatura f WHERE f.uId = :uId")
    , @NamedQuery(name = "Fatura.findByMId", query = "SELECT f FROM Fatura f WHERE f.mId = :mId")
    , @NamedQuery(name = "Fatura.findByAdet", query = "SELECT f FROM Fatura f WHERE f.adet = :adet")
    , @NamedQuery(name = "Fatura.findByFiyat", query = "SELECT f FROM Fatura f WHERE f.fiyat = :fiyat")})
public class Fatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "F_ID")
    private Integer fId;
    @Column(name = "U_ID")
    private String uId;
    @Column(name = "M_ID")
    private Integer mId;
    @Column(name = "ADET")
    private Integer adet;
    @Column(name = "FIYAT")
    private Integer fiyat;

    public Fatura() {
    }

    public Fatura(Integer fId) {
        this.fId = fId;
    }

    public Integer getFId() {
        return fId;
    }

    public void setFId(Integer fId) {
        this.fId = fId;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public Integer getFiyat() {
        return fiyat;
    }

    public void setFiyat(Integer fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fId != null ? fId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fatura)) {
            return false;
        }
        Fatura other = (Fatura) object;
        if ((this.fId == null && other.fId != null) || (this.fId != null && !this.fId.equals(other.fId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13Lab.Fatura[ fId=" + fId + " ]";
    }
    
}
