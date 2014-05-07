/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "ethnicity")
    private String ethnicity;

    @Column(name = "adress_complement")
    private String adressComplement;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "sus_card")
    private String susCard;

    @Column(name = "responsible_for_completing")
    private String responsibleForCompleting;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Calendar birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "registration_date")
    private Calendar registrationDate;

    @Column(name = "gender")
    private char gender;

    @Column(name = "adress_number")
    private int adressNumber;
                            
    @ManyToOne
    @JoinColumn(name = "id_street", referencedColumnName = "id")
    private Street adressStreet;

    @ManyToOne
    @JoinColumn(name = "id_agent", referencedColumnName = "id")
    private HealthAgent healthAgent;

    @OneToMany(mappedBy = "psfUser", targetEntity = Administration.class)
    private List<Administration> administrations;

    public Street getAdressStreet() {
        return adressStreet;
    }

    public void setAdressStreet(Street adressStreet) {
        this.adressStreet = adressStreet;
    }

    public List<Administration> getAdministrations() {
        return administrations;
    }

    public void setAdministrations(List<Administration> administrations) {
        this.administrations = administrations;
    }

    public HealthAgent getHealthAgent() {
        return healthAgent;
    }

    public void setHealthAgent(HealthAgent healthAgent) {
        this.healthAgent = healthAgent;
    }

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

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
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

}
