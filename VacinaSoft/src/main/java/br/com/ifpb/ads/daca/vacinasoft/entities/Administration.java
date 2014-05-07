/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "administration_tbl")
public class Administration extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Column (name = "strategy_administration", nullable = false)
    private String strategyAdministration;
    
    @Column (name = "psf_administration")
    private String psfAdministration;
    
    @Column (name = "cnes")
    private String cnes;
    
    @Column (name = "vaccine_dose", nullable = false)
    private String vaccineDose;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    @Column (name = "administration_date", nullable = false)
    private Calendar administrationDate;
    
    @Column (name = "lot_vaccine")
    @OneToOne (mappedBy = "lotId", targetEntity = LotVaccine.class)
    private LotVaccine lotVaccine;
   
    @Column (name = "psf_user")
    @ManyToOne 
    @JoinColumn(name = "id_psf_user", referencedColumnName = "id")
    private PSFUser psfUser;
    
    @Column (name = "vaccinator")
    @OneToOne (mappedBy = "coren_record", targetEntity = Vaccinator.class)
    private Vaccinator vaccinator;

    /**
     * @return the strategyAdministration
     */
    public String getStrategyAdministration() {
        return strategyAdministration;
    }

    /**
     * @param strategyAdministration the strategyAdministration to set
     */
    public void setStrategyAdministration(String strategyAdministration) {
        this.strategyAdministration = strategyAdministration;
    }

    /**
     * @return the psfAdministration
     */
    public String getPsfAdministration() {
        return psfAdministration;
    }

    /**
     * @param psfAdministration the psfAdministration to set
     */
    public void setPsfAdministration(String psfAdministration) {
        this.psfAdministration = psfAdministration;
    }

    /**
     * @return the cnes
     */
    public String getCnes() {
        return cnes;
    }

    /**
     * @param cnes the cnes to set
     */
    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    /**
     * @return the vaccineDose
     */
    public String getVaccineDose() {
        return vaccineDose;
    }

    /**
     * @param vaccineDose the vaccineDose to set
     */
    public void setVaccineDose(String vaccineDose) {
        this.vaccineDose = vaccineDose;
    }

    /**
     * @return the administrationDate
     */
    public Calendar getAdministrationDate() {
        return administrationDate;
    }

    /**
     * @param administrationDate the administrationDate to set
     */
    public void setAdministrationDate(Calendar administrationDate) {
        this.administrationDate = administrationDate;
    }
    
}
