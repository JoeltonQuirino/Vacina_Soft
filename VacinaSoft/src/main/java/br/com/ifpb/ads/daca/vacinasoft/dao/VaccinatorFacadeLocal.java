/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccinator;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface VaccinatorFacadeLocal {

    void create(Vaccinator vaccinator);

    void edit(Vaccinator vaccinator);

    void remove(Vaccinator vaccinator);

    Vaccinator find(Object id);

    List<Vaccinator> findAll();

    List<Vaccinator> findRange(int[] range);

    int count();
    
}
