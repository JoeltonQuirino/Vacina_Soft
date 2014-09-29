package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.AdministrationDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.AdministrationDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class AdministrationService extends AbstractService<Administration> implements AdministrationServiceInterface{
    
    @Inject @AdministrationDaoQualifiers
    private AdministrationDaoInterface administrationDaoInterface;
    
    @Override
    public GenericDaoInterface<Administration> getDaoInterface() {
        return administrationDaoInterface;
    }
    
    @Override
    public Long vaccinatedChildren(Integer monthsAgo) {
         return administrationDaoInterface.vaccinatedChildren(monthsAgo);
    }
    
}
