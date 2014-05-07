/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccine;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface VaccineFacadeLocal {

    void create(Vaccine vaccine);

    void edit(Vaccine vaccine);

    void remove(Vaccine vaccine);

    Vaccine find(Object id);

    List<Vaccine> findAll();

    List<Vaccine> findRange(int[] range);

    int count();
    
}
