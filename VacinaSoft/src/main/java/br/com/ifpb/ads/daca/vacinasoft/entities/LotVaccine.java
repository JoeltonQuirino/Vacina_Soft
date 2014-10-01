package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LotVaccine entity features needed for the registration of a batch or a 
 * particular vaccine attributes.
 * @author Joelton
 */
@Entity
@Table(name = "lot_vaccine_tbl")
public class LotVaccine extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Temporal (TemporalType.DATE)
    @Column (name = "validity_date", nullable = false, updatable = false)
    private Date validityDate;
    
    @Column (name = "laboratory", nullable = false, updatable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amountAmpoule; 
    
    @Temporal(TemporalType.DATE)
    @Column (name = "receipt_date", updatable = false)
    private Date receiptDate; 
    
    @Column (name = "lot_code", nullable = false, updatable = false)
    private String lotCode;
    
    @Column (name = "amount_dose", nullable = false, updatable = false)
    private int amountDose; 
    
    @ManyToOne
    @JoinColumn(name = "id_vaccine", referencedColumnName = "id", nullable = false, updatable = false)
    private Vaccine idVaccine;
    
    /*
    Getters and Setters
    */
    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }
  
    public int getAmountAmpoule() {
        return amountAmpoule;
    }
 
    public void setAmountAmpoule(int amountAmpoule) {
        this.amountAmpoule = amountAmpoule;
    }
  
    public Date getReceiptDate() {
        return receiptDate;
    }
   
    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }
   
    public String getLotCode() {
        return lotCode;
    }
 
    public void setLotCode(String lotCode) {
        this.lotCode = lotCode;
    }

    public int getAmountDose() {
        return amountDose;
    }

    public void setAmountDose(int amountDose) {
        this.amountDose = amountDose;
    }

    public Vaccine getVaccine() {
        return idVaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.idVaccine = vaccine;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    } 
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.validityDate);
        hash = 53 * hash + Objects.hashCode(this.laboratory);
        hash = 53 * hash + this.amountAmpoule;
        hash = 53 * hash + Objects.hashCode(this.receiptDate);
        hash = 53 * hash + Objects.hashCode(this.lotCode);
        hash = 53 * hash + this.amountDose;
        hash = 53 * hash + Objects.hashCode(this.idVaccine);
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
        final LotVaccine other = (LotVaccine) obj;
        if (!Objects.equals(this.validityDate, other.validityDate)) {
            return false;
        }
        if (!Objects.equals(this.laboratory, other.laboratory)) {
            return false;
        }
        if (this.amountAmpoule != other.amountAmpoule) {
            return false;
        }
        if (!Objects.equals(this.receiptDate, other.receiptDate)) {
            return false;
        }
        if (!Objects.equals(this.lotCode, other.lotCode)) {
            return false;
        }
        if (this.amountDose != other.amountDose) {
            return false;
        }
        if (!Objects.equals(this.idVaccine, other.idVaccine)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "LotVaccine{" + "validityDate=" + validityDate + ", laboratory=" + laboratory + ", amountAmpoule=" + amountAmpoule + ", receiptDate=" + receiptDate + ", lotCode=" + lotCode + ", amountDose=" + amountDose + ", idVaccine=" + idVaccine +'}';
    }
    
}
