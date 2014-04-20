/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joelton
 */
@Entity
@Table(name = "Vaccinator_tbl")
public class Vaccinator_tbl extends AbstractEntity implements Serializable{
    
    @Column (name = "name_vaccinator", nullable = false, length = 100)
    private String name_vaccinator;
    
    @Column (name = "cpf_vaccinator", nullable = false, length = 11)
    private String cpf_vaccinator;
}