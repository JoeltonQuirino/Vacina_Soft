package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "health_agent_tbl")
public class HealthAgent extends AbstractEntity implements Serializable {

    @Column(name = "name", updatable = false)
    private String name;

    @OneToMany(mappedBy = "healthAgent", targetEntity = PSFUser.class)
    private List<PSFUser> PSFUsers;

    public List<PSFUser> getPSFUsers() {
        return PSFUsers;
    }

    public void setPSFUsers(List<PSFUser> PSFUsers) {
        this.PSFUsers = PSFUsers;
    }

    @OneToOne
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    private Area serviceArea;

    public Area getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(Area serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.PSFUsers);
        hash = 47 * hash + Objects.hashCode(this.serviceArea);
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
        final HealthAgent other = (HealthAgent) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.PSFUsers, other.PSFUsers)) {
            return false;
        }
        if (!Objects.equals(this.serviceArea, other.serviceArea)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

}
