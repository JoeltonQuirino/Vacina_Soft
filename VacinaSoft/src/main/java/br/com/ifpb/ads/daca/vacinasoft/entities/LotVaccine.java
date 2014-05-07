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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "lot_vaccine_tbl")
public class LotVaccine extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    @Column (name = "validity_date", nullable = false)
    private Calendar validityDate;
    
    @Column (name = "laboratory", nullable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amountAmpoule; // quantidade de ampolas
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "receipt_date")
    private Calendar receiptDate; // data de recebimento
    
    @Column (name = "lot_code", nullable = false)
    private String lotCode;
    
    @Column (name = "amount_dose")
    private int amountDose; // quantidade de doses
    
    @ManyToOne
    @JoinColumn(name = "id_vaccine", referencedColumnName = "id")
    private Vaccine idVaccine;
    
    @ManyToOne
    @JoinColumn (name = "id_lot", referencedColumnName = "id")
    private Administration lotId;
        
    /**
     * @return the laboratory
     */
    public String getLaboratory() {
        return laboratory;
    }

    /**
     * @param laboratory the laboratory to set
     */
    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    /**
     * @return the amountAmpoule
     */
    public int getAmountAmpoule() {
        return amountAmpoule;
    }

    /**
     * @param amountAmpoule the amountAmpoule to set
     */
    public void setAmountAmpoule(int amountAmpoule) {
        this.amountAmpoule = amountAmpoule;
    }

    /**
     * @return the receiptDate
     */
    public Calendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * @param receiptDate the receiptDate to set
     */
    public void setReceiptDate(Calendar receiptDate) {
        this.receiptDate = receiptDate;
    }

    /**
     * @return the lotCode
     */
    public String getLotCode() {
        return lotCode;
    }

    /**
     * @param lotCode the lotCode to set
     */
    public void setLotCode(String lotCode) {
        this.lotCode = lotCode;
    }

    /**
     * @return the amountDose
     */
    public int getAmountDose() {
        return amountDose;
    }

    /**
     * @param amountDose the amountDose to set
     */
    public void setAmountDose(int amountDose) {
        this.amountDose = amountDose;
    }

    /**
     * @return the vaccine
     */
    public Vaccine getVaccine() {
        return idVaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(Vaccine vaccine) {
        this.idVaccine = vaccine;
    }

    /**
     * @return the validityDate
     */
    public Calendar getValidityDate() {
        return validityDate;
    }

    /**
     * @param validityDate the validityDate to set
     */
    public void setValidityDate(Calendar validityDate) {
        this.validityDate = validityDate;
    }   
}
