/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
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
    
    @Column (name = "way_administration", nullable = false)
    private String wayAdministration;
    
    @Column (name = "name_vaccine", nullable = false)
    private String nameVaccine;
    
    @Column (name = "lot_id")
    @OneToMany(mappedBy = "lot_id", targetEntity = LotVaccine.class)
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
}
