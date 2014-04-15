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
@Table(name="LotVaccine")
public class LotVaccine {
    
    Date validityDate;
    String laboratory;
    Int amountAmpoule; // quantidade de ampolas
    Date receiptDate; // data de recebimento
    String lotCode;
    Int amountDose; // quantidade de doses
}
