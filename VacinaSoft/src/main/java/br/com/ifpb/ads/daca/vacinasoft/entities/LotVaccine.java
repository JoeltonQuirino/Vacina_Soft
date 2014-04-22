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
@Table(name = "lot_vaccine_tbl")
public class LotVaccine extends AbstractEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_lot", nullable = false)
    private Long id_lot;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    @Column (name = "validity_date", nullable = false)
    private Date validity_date;
    
    @Column (name = "laboratory", nullable = false)
    private String laboratory;
    
    @Column (name = "amount_ampoule")
    private int amount_ampoule; // quantidade de ampolas
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "receipt_date")
    private Date receipt_date; // data de recebimento
    
    @Column (name = "lot_code", nullable = false)
    private String lot_code;
    
    @Column (name = "amount_dose")
    private int amount_dose; // quantidade de doses
}
