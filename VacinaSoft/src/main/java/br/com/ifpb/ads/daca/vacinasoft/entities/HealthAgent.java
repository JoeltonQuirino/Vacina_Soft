package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.List;
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

}
