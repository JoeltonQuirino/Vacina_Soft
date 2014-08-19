/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.entities;

import br.com.ifpb.ads.daca.vacinasoft.entities.interfaces.AdministrationFacade;
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
public class Administration extends AbstractEntity implements Serializable,AdministrationFacade {

    private static final long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Column(name = "strategy_administration", nullable = false, updatable = false)
    private String strategyAdministration;

    @Column(name = "psf_administration", nullable = false, updatable = false)
    private String psfAdministration;

    @Column(name = "cnes", nullable = true, updatable = false)
    private String cnes;

    @Column(name = "vaccine_dose", nullable = false, updatable = false)
    private String vaccineDose;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "administration_date", nullable = false, updatable = false)
    private Calendar administrationDate;

    @OneToOne(mappedBy = "lotId", targetEntity = LotVaccine.class)
    private LotVaccine lotVaccine;

    @ManyToOne()
    @JoinColumn(name = "id_psf_user", referencedColumnName = "id", nullable = false)
    private PSFUser psfUser;

    @ManyToOne
    @JoinColumn(name = "id_vaccinator", referencedColumnName = "id", nullable = false, updatable = false)
    private Vaccinator vaccinator;

    public LotVaccine getLotVaccine() {
        return lotVaccine;
    }

    public void setLotVaccine(LotVaccine lotVaccine) {
        this.lotVaccine = lotVaccine;
    }

    public PSFUser getPsfUser() {
        return psfUser;
    }

    public void setPsfUser(PSFUser psfUser) {
        this.psfUser = psfUser;
    }

    public Vaccinator getVaccinator() {
        return vaccinator;
    }

    public void setVaccinator(Vaccinator vaccinator) {
        this.vaccinator = vaccinator;
    }

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
