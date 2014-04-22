/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author WitaloCarlos
 */
@Entity
@Table(name = "health_agent_tbl")
public class HealthAgent extends AbstractEntity implements Serializable{
    
    @Column(name = "name")
    private String name;
    @Column(name = "service_area")
    private long service_area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getService_area() {
        return service_area;
    }

    public void setService_area(long service_area) {
        this.service_area = service_area;
    }
    
    
    
}
