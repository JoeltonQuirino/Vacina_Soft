/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "vaccinator_tbl")
public class Vaccinator extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column (name = "coren_record", nullable = false)
    private String corenRecord;
    
    @Column (name = "name_vaccinator", nullable = false, length = 100)
    private String nameVaccinator;
    
    @Column (name = "cpf_vaccinator", nullable = false, length = 11)
    private String cpfVaccinator;
    
    @Column (name = "administration")
    @OneToMany
    @JoinColumn (name = "coren_reccord", table = "vaccinator")
    private Administration administration;

    /**
     * @return the corenRecord
     */
    public String getCorenRecord() {
        return corenRecord;
    }

    /**
     * @param corenRecord the corenRecord to set
     */
    public void setCorenRecord(String corenRecord) {
        this.corenRecord = corenRecord;
    }

    /**
     * @return the nameVaccinator
     */
    public String getNameVaccinator() {
        return nameVaccinator;
    }

    /**
     * @param nameVaccinator the nameVaccinator to set
     */
    public void setNameVaccinator(String nameVaccinator) {
        this.nameVaccinator = nameVaccinator;
    }

    /**
     * @return the cpfVaccinator
     */
    public String getCpfVaccinator() {
        return cpfVaccinator;
    }

    /**
     * @param cpfVaccinator the cpfVaccinator to set
     */
    public void setCpfVaccinator(String cpfVaccinator) {
        this.cpfVaccinator = cpfVaccinator;
    }   
}