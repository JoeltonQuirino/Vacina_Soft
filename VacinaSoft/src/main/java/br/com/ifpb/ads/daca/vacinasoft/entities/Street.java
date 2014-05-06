/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "street_tbl")
public class Street extends AbstractEntity implements Serializable {

    @Column(name = "district")
    private String district;

    @Column(name = "name_street")
    private String nameStreet;

    @Column(name = "region")
    private String region;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country_code")
    private String countryCode;

    @OneToMany(mappedBy = "adressStreet", targetEntity = PSFUser.class)
    private List<PSFUser> psfUsers;

    public List<PSFUser> getPsfUsers() {
        return psfUsers;
    }

    public void setPsfUsers(List<PSFUser> psfUsers) {
        this.psfUsers = psfUsers;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getRegion() {

        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

}
