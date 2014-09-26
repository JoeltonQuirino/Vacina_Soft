package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
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
public class Administration extends AbstractEntity implements Serializable {

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

    @ManyToOne
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.strategyAdministration);
        hash = 53 * hash + Objects.hashCode(this.psfAdministration);
        hash = 53 * hash + Objects.hashCode(this.cnes);
        hash = 53 * hash + Objects.hashCode(this.vaccineDose);
        hash = 53 * hash + Objects.hashCode(this.administrationDate);
        hash = 53 * hash + Objects.hashCode(this.lotVaccine);
        hash = 53 * hash + Objects.hashCode(this.psfUser);
        hash = 53 * hash + Objects.hashCode(this.vaccinator);
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
        final Administration other = (Administration) obj;
        if (!Objects.equals(this.strategyAdministration, other.strategyAdministration)) {
            return false;
        }
        if (!Objects.equals(this.psfAdministration, other.psfAdministration)) {
            return false;
        }
        if (!Objects.equals(this.cnes, other.cnes)) {
            return false;
        }
        if (!Objects.equals(this.vaccineDose, other.vaccineDose)) {
            return false;
        }
        if (!Objects.equals(this.administrationDate, other.administrationDate)) {
            return false;
        }
        if (!Objects.equals(this.lotVaccine, other.lotVaccine)) {
            return false;
        }
        if (!Objects.equals(this.psfUser, other.psfUser)) {
            return false;
        }
        if (!Objects.equals(this.vaccinator, other.vaccinator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administration{" + "strategyAdministration=" + strategyAdministration + ", psfAdministration=" + psfAdministration + ", cnes=" + cnes + ", vaccineDose=" + vaccineDose + ", administrationDate=" + administrationDate + ", lotVaccine=" + lotVaccine + ", psfUser=" + psfUser + ", vaccinator=" + vaccinator + '}';
    }

}
