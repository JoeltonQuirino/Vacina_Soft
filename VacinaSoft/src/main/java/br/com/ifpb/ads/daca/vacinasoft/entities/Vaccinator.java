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
@Table(name = "vaccinator_tbl")
public class Vaccinator extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    
    @Column(name = "coren_record", nullable = false, updatable = true, unique = true)
    private String corenRecord;

    @Column(name = "name_vaccinator", nullable = false, length = 100, updatable = false)
    private String nameVaccinator;

    @Column(name = "cpf_vaccinator", nullable = false, length = 11, updatable = false)
    private String cpfVaccinator;

    @OneToMany(mappedBy = "vaccinator", targetEntity = Administration.class)
    private List<Administration> administrations;

    public List<Administration> getAdministrations() {
        return administrations;
    }

    public void setAdministrations(List<Administration> administrations) {
        this.administrations = administrations;
    }

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
