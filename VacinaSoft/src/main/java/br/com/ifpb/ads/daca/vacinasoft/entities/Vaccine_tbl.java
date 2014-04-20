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
 * @author Joelton
 */
@Entity
@Table(name = "Vaccine_tbl")
public class Vaccine_tbl extends AbstractEntity implements Serializable {
    
    @Column (name = "way_administration", nullable = false)
    private String way_administration;
    
    @Column (name = "name_vaccine", nullable = false)
    private String name_vaccine;
}
