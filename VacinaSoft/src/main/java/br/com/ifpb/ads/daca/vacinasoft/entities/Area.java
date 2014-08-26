package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "area_tbl")
public class Area extends AbstractEntity implements Serializable{
    
    @Column(name = "description", nullable = true, updatable = true)
    private String description;
    
    @OneToOne(mappedBy = "serviceArea", targetEntity = HealthAgent.class)
    private HealthAgent agent;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
