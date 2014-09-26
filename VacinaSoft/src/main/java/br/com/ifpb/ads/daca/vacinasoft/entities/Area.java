package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.util.Objects;
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
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.agent);
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
        final Area other = (Area) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.agent, other.agent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
