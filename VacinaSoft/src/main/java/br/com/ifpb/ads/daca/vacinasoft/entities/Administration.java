/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name="Administration")
public class Administration extends AbstractEntity{
    
    private String strategyAdministration;
    private String psfAdministration;
    private String cnes;
    private String vaccineDose;
    private Date administrationDate;
}
