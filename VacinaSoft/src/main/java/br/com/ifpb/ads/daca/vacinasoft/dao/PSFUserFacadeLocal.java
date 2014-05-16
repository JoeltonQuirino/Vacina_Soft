/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.PSFUser;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Joelton
 */
@Local
public interface PSFUserFacadeLocal {

    void create(PSFUser pSFUser);

    void edit(PSFUser pSFUser);

    void remove(PSFUser pSFUser);

    PSFUser find(Object id);

    List<PSFUser> findAll();

    List<PSFUser> findRange(int[] range);

    int count();
    
}
