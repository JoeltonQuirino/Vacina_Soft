/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    private Date birthDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "gender")
    private char gender;

    @Column(name = "adress_number")
    private int adressNumber;

    @Column(name = "adress_street")
    @OneToMany(mappedBy = "psfUsers", targetEntity = Street.class)
    private Street adressStreet;

    @Column(name = "health_agent")
    @ManyToOne
    @JoinColumn(name = "id", table = "health_agent_tbl")
    private HealthAgent healthAgent;
    
    //@OneToOne
    //@JoinColumn (name = "user_id", referencedColumnName = "")
    

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

}
