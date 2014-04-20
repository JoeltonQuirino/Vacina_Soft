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
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "Administration_tbl")
public class Administration_tbl extends AbstractEntity implements Serializable{
    
    @Column (name = "strategy_administration", nullable = false)
    private String strategy_administration;
    
    @Column (name = "psf_administration")
    private String psf_administration;
    
    @Column (name = "cnes")
    private String cnes;
    
    @Column (name = "vaccine_dose", nullable = false)
    private String vaccine_dose;
    
    @Column (name = "administration_date", nullable = false)
    private Date administration_date;
}
