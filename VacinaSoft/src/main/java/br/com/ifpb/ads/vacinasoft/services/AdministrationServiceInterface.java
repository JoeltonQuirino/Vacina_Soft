package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;

/**
 *
 * @author MarkusPatriota
 */
public interface AdministrationServiceInterface extends ServiceInterface<Administration>{
    
    public Long vaccinatedChildren(Integer monthsAgo);
        
}
