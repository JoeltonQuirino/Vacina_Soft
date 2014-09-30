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
import javax.persistence.TemporalType;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "psf_user_tbl")
public class PSFUser extends AbstractEntity implements Serializable {

    @Column(name = "user_name", nullable = false, updatable = false)
    private String userName;

    @Column(name = "mother_name", updatable = false)
    private String motherName;

    @Column(name = "father_name", updatable = false)
    private String fatherName;

    @Column(name = "ethnicity", nullable = false, updatable = false)
    private String ethnicity;

    @Column(name = "adress_complement", nullable = false)
    private String adressComplement;

    @Column(name = "cpf", unique = true, updatable = false, length = 15)
    private String cpf;

    @Column(name = "rg", unique = true, updatable = false)
    private String rg;

    @Column(name = "sus_card", unique = true, updatable = false)
    private String susCard;

    @Column(name = "responsible_for_completing", nullable = false, updatable = false)
    private String responsibleForCompleting;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false, updatable = false)
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "registration_date", nullable = false, updatable = false)
    private Date registrationDate;

    @Column(name = "gender", nullable = false, updatable = false)
    private char gender;

    @Column(name = "adress_number", updatable = true)
    private int adressNumber;

    @ManyToOne
    @JoinColumn(name = "id_street", referencedColumnName = "id", nullable = false)
    private Street adressStreet;

    @ManyToOne
    @JoinColumn(name = "id_agent", referencedColumnName = "id", nullable = false, updatable = false)
    private HealthAgent healthAgent;

//    @ManyToOne
//    @JoinColumn(name = "id_vaccines", referencedColumnName = "id", nullable = false, updatable = false)
//    private Vaccine vaccine;
    
    public Street getAdressStreet() {
        return adressStreet;
    }

    public void setAdressStreet(Street adressStreet) {
        this.adressStreet = adressStreet;
    }

//    public Vaccine getVaccine() {
//        return vaccine;
//    }
//
//    public void setVaccine(Vaccine vaccine) {
//        this.vaccine = vaccine;
//    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getAdressComplement() {
        return adressComplement;
    }

    public void setAdressComplement(String adressComplement) {
        this.adressComplement = adressComplement;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSusCard() {
        return susCard;
    }

    public void setSusCard(String susCard) {
        this.susCard = susCard;
    }

    public String getResponsibleForCompleting() {
        return responsibleForCompleting;
    }

    public void setResponsibleForCompleting(String responsibleForCompleting) {
        this.responsibleForCompleting = responsibleForCompleting;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAdressNumber() {
        return adressNumber;
    }

    public void setAdressNumber(int adressNumber) {
        this.adressNumber = adressNumber;
    }

    public HealthAgent getHealthAgent() {
        return healthAgent;
    }

    public void setHealthAgent(HealthAgent healthAgent) {
        this.healthAgent = healthAgent;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.userName);
        hash = 23 * hash + Objects.hashCode(this.motherName);
        hash = 23 * hash + Objects.hashCode(this.fatherName);
        hash = 23 * hash + Objects.hashCode(this.ethnicity);
        hash = 23 * hash + Objects.hashCode(this.adressComplement);
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + Objects.hashCode(this.rg);
        hash = 23 * hash + Objects.hashCode(this.susCard);
        hash = 23 * hash + Objects.hashCode(this.responsibleForCompleting);
        hash = 23 * hash + Objects.hashCode(this.birthDate);
        hash = 23 * hash + Objects.hashCode(this.registrationDate);
        hash = 23 * hash + this.gender;
        hash = 23 * hash + this.adressNumber;
        hash = 23 * hash + Objects.hashCode(this.adressStreet);
        hash = 23 * hash + Objects.hashCode(this.healthAgent);
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
        final PSFUser other = (PSFUser) obj;
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.motherName, other.motherName)) {
            return false;
        }
        if (!Objects.equals(this.fatherName, other.fatherName)) {
            return false;
        }
        if (!Objects.equals(this.ethnicity, other.ethnicity)) {
            return false;
        }
        if (!Objects.equals(this.adressComplement, other.adressComplement)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.susCard, other.susCard)) {
            return false;
        }
        if (!Objects.equals(this.responsibleForCompleting, other.responsibleForCompleting)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Objects.equals(this.registrationDate, other.registrationDate)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (this.adressNumber != other.adressNumber) {
            return false;
        }
        if (!Objects.equals(this.adressStreet, other.adressStreet)) {
            return false;
        }
        if (!Objects.equals(this.healthAgent, other.healthAgent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return userName;
    }

}
