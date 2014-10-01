package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Street entity features necessary for the registration of new address attributes.
 * @author WitaloCarlos
 */
@Entity
@Table(name = "street_tbl")
public class Street extends AbstractEntity implements Serializable {

    @Column(name = "district", nullable = true, updatable = true)
    private String district;

    @Column(name = "name_street", nullable = true, updatable = true)
    private String nameStreet;

    @Column(name = "region", nullable = false, updatable = true)
    private String region;

    @Column(name = "postal_code", nullable = true, updatable = true)
    private String postalCode;

    @Column(name = "country_code", nullable = false, updatable = true)
    private String countryCode;

    @OneToMany(mappedBy = "adressStreet", targetEntity = PSFUser.class)
    private List<PSFUser> psfUsers;
    
    /*
    Getters and Setters
    */
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
    
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.district);
        hash = 23 * hash + Objects.hashCode(this.nameStreet);
        hash = 23 * hash + Objects.hashCode(this.region);
        hash = 23 * hash + Objects.hashCode(this.postalCode);
        hash = 23 * hash + Objects.hashCode(this.countryCode);
        hash = 23 * hash + Objects.hashCode(this.psfUsers);
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
        final Street other = (Street) obj;
        if (!Objects.equals(this.district, other.district)) {
            return false;
        }
        if (!Objects.equals(this.nameStreet, other.nameStreet)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.postalCode, other.postalCode)) {
            return false;
        }
        if (!Objects.equals(this.countryCode, other.countryCode)) {
            return false;
        }
        if (!Objects.equals(this.psfUsers, other.psfUsers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nameStreet;
    }

}
