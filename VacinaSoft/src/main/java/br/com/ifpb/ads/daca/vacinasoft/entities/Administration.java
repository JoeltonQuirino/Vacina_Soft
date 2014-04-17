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
@Table(name = "Administration")
public class Administration extends AbstractEntity implements Serializable{
    
    @Column (name = "strategyAdministration")
    private String strategyAdministration;
    
    @Column (name = "psfAdministration")
    private String psfAdministration;
    
    @Column (name = "cnes")
    private String cnes;
    
    @Column (name = "vaccine")
    private String vaccineDose;
    
    @Column (name = "administrationDate")
    private Date administrationDate;
}
