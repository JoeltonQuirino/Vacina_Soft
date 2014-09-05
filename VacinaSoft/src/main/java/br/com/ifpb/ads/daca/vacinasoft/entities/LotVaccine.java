package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author Joelton
 */
@Embeddable
public class LotVaccine extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    @Column (name = "validity_date", nullable = false, updatable = false)
    private Calendar validityDate;
    
    @Column (name = "laboratory", nullable = false, updatable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amountAmpoule; // quantidade de ampolas
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "receipt_date", updatable = false)
    private Calendar receiptDate; // data de recebimento
    
    @Column (name = "lot_code", nullable = false, updatable = false)
    private String lotCode;
    
    @Column (name = "amount_dose", nullable = false, updatable = false)
    private int amountDose; // quantidade de doses
            
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
