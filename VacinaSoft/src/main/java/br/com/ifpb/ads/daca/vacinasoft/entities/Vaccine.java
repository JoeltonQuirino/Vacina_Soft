/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name="Vaccine")
public class Vaccine implements Serializable {
    
    private String wayAdministration;
    private String nameVaccine;
}
