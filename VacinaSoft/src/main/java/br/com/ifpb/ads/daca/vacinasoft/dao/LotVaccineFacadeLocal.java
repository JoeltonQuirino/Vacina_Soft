/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.LotVaccine;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface LotVaccineFacadeLocal {

    void create(LotVaccine lotVaccine);

    void edit(LotVaccine lotVaccine);

    void remove(LotVaccine lotVaccine);

    LotVaccine find(Object id);

    List<LotVaccine> findAll();

    List<LotVaccine> findRange(int[] range);

    int count();
    
}
