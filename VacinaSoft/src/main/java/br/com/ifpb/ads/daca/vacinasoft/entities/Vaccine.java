package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @OneToMany(mappedBy = "vaccine", targetEntity = PSFUser.class)
    private List<PSFUser> psfUser;
    
    @ManyToOne
    @JoinColumn(name = "id_vaccinator", referencedColumnName = "id", nullable = false, updatable = false)
    private Vaccinator vaccinator;
        
    @Embedded
    private Administration administration;
    
    @Embedded
    private LotVaccine lotVaccine;
    
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

    public List<PSFUser> getPsfUser() {
        return psfUser;
    }

    public void setPsfUser(List<PSFUser> psfUser) {
        this.psfUser = psfUser;
    }

    public Vaccinator getVaccinator() {
        return vaccinator;
    }

    public void setVaccinator(Vaccinator vaccinator) {
        this.vaccinator = vaccinator;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public LotVaccine getLotVaccine() {
        return lotVaccine;
    }

    public void setLotVaccine(LotVaccine lotVaccine) {
        this.lotVaccine = lotVaccine;
    }

}
