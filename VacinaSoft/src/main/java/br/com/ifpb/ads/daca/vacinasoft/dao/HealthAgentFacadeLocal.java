/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.HealthAgent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface HealthAgentFacadeLocal {

    void create(HealthAgent healthAgent);

    void edit(HealthAgent healthAgent);

    void remove(HealthAgent healthAgent);

    HealthAgent find(Object id);

    List<HealthAgent> findAll();

    List<HealthAgent> findRange(int[] range);

    int count();
    
}
