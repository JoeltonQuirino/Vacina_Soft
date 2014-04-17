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
@Table(name = "LotVaccine")
public class LotVaccine extends AbstractEntity implements Serializable{
    
    @Column (name = "validityDate")
    private Date validityDate;
    
    @Column (name = "laboratory")
    private String laboratory;
    
    @Column (name = "amountAmpoule")
    private int amountAmpoule; // quantidade de ampolas
    
    @Column (name = "receiptDate")
    private Date receiptDate; // data de recebimento
    
    @Column (name = "lotCode")
    private String lotCode;
    
    @Column (name = "amountDose")
    private int amountDose; // quantidade de doses
}
