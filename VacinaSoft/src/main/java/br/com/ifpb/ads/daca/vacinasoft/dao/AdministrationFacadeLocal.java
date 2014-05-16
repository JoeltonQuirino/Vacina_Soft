/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface AdministrationFacadeLocal {

    void create(Administration administration);

    void edit(Administration administration);

    void remove(Administration administration);

    Administration find(Object id);

    List<Administration> findAll();

    List<Administration> findRange(int[] range);

    int count();
    
}
