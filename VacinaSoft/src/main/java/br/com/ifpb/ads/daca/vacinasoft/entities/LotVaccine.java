package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
    @Column (name = "validity_date", nullable = false, updatable = false)
    private Date validityDate;
    
    @Column (name = "laboratory", nullable = false, updatable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amountAmpoule; // quantidade de ampolas
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "receipt_date", updatable = false)
    private Date receiptDate; // data de recebimento
    
    @Column (name = "lot_code", nullable = false, updatable = false)
    private String lotCode;
    
    @Column (name = "amount_dose", nullable = false, updatable = false)
    private int amountDose; // quantidade de doses
    
    @ManyToOne
    @JoinColumn(name = "id_vaccine", referencedColumnName = "id", nullable = false, updatable = false)
    private Vaccine idVaccine;
    
    @ManyToOne
    @JoinColumn (name = "id_lot", referencedColumnName = "id", nullable = false, updatable = false)
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
    public Date getReceiptDate() {
        return receiptDate;
    }

    /**
     * @param receiptDate the receiptDate to set
     */
    public void setReceiptDate(Date receiptDate) {
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
    public Date getValidityDate() {
        return validityDate;
    }

    /**
     * @param validityDate the validityDate to set
     */
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
        hash = 53 * hash + Objects.hashCode(this.lotId);
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
        if (!Objects.equals(this.lotId, other.lotId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LotVaccine{" + "validityDate=" + validityDate + ", laboratory=" + laboratory + ", amountAmpoule=" + amountAmpoule + ", receiptDate=" + receiptDate + ", lotCode=" + lotCode + ", amountDose=" + amountDose + ", idVaccine=" + idVaccine + ", lotId=" + lotId + '}';
    }
    
}
