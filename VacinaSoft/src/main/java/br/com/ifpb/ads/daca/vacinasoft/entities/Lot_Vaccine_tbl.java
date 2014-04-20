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
@Table(name = "Lot_Vaccine")
public class Lot_Vaccine_tbl extends AbstractEntity implements Serializable{
    
    @Column (name = "validity_date", nullable = false)
    private Date validity_date;
    
    @Column (name = "laboratory", nullable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amount_ampoule; // quantidade de ampolas
    
    @Column (name = "receipt_date")
    private Date receipt_date; // data de recebimento
    
    @Column (name = "lot_code", nullable = false)
    private String lot_code;
    
    @Column (name = "amount_dose")
    private int amount_dose; // quantidade de doses
}
