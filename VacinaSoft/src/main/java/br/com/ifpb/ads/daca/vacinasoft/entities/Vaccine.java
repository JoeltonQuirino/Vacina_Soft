package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "vaccine_tbl")
public class Vaccine extends AbstractEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column (name = "way_administration", nullable = false, updatable = false)
    private String wayAdministration;
    
    @Column (name = "name_vaccine", nullable = false, updatable = false)
    private String nameVaccine; 
    
    @OneToMany(mappedBy = "idVaccine", targetEntity = LotVaccine.class)
    private List<LotVaccine> lots;

    /**
     * @return the wayAdministration
     */
    public String getWayAdministration() {
        return wayAdministration;
    }

    /**
     * @param wayAdministration the wayAdministration to set
     */
    public void setWayAdministration(String wayAdministration) {
        this.wayAdministration = wayAdministration;
    }

    /**
     * @return the nameVaccine
     */
    public String getNameVaccine() {
        return nameVaccine;
    }

    /**
     * @param nameVaccine the nameVaccine to set
     */
    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    /**
     * @return the lots
     */
    public List<LotVaccine> getLots() {
        return lots;
    }

    /**
     * @param lots the lots to set
     */
    public void setLots(List<LotVaccine> lots) {
        this.lots = lots;
    }
    
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.wayAdministration);
        hash = 19 * hash + Objects.hashCode(this.nameVaccine);
        hash = 19 * hash + Objects.hashCode(this.lots);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vaccine other = (Vaccine) obj;
        if (!Objects.equals(this.wayAdministration, other.wayAdministration)) {
            return false;
        }
        if (!Objects.equals(this.nameVaccine, other.nameVaccine)) {
            return false;
        }
        if (!Objects.equals(this.lots, other.lots)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nameVaccine;
    }

}
