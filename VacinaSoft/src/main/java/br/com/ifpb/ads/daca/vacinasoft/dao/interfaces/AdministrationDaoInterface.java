package br.com.ifpb.ads.daca.vacinasoft.dao.interfaces;

import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;

/**
 * AdministrationDaoInterface
 * @author Hugo
 */
public interface AdministrationDaoInterface extends GenericDaoInterface<Administration> {
    
        public Long vaccinatedChildren(Integer monthsAgo);
}
