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
@Table(name = "MUSTERI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri.findAll", query = "SELECT m FROM Musteri m")
    , @NamedQuery(name = "Musteri.findByMId", query = "SELECT m FROM Musteri m WHERE m.mId = :mId")
    , @NamedQuery(name = "Musteri.findByAdi", query = "SELECT m FROM Musteri m WHERE m.adi = :adi")})
public class Musteri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "M_ID")
    private Integer mId;
    @Column(name = "ADI")
    private String adi;

    public Musteri() {
    }

    public Musteri(Integer mId) {
        this.mId = mId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteri)) {
            return false;
        }
        Musteri other = (Musteri) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13Lab.Musteri[ mId=" + mId + " ]";
    }
    
}
