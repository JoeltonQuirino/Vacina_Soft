/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name="LotVaccine")
public class LotVaccine extends AbstractEntity implements Serializable{
    
    private Date validityDate;
    private String laboratory;
    private int amountAmpoule; // quantidade de ampolas
    private Date receiptDate; // data de recebimento
    private String lotCode;
    private int amountDose; // quantidade de doses
}
