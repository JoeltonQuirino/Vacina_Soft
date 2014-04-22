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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "administration_tbl")
public class Administration extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_administration", nullable = false)
    private Long id_administration;
    
    @Column (name = "strategy_administration", nullable = false)
    private String strategy_administration;
    
    @Column (name = "psf_administration")
    private String psf_administration;
    
    @Column (name = "cnes")
    private String cnes;
    
    @Column (name = "vaccine_dose", nullable = false)
    private String vaccine_dose;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    @Column (name = "administration_date", nullable = false)
    private Date administration_date;
}
