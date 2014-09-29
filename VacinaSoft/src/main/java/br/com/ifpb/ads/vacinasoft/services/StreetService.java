package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.StreetDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.StreetDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Street;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class StreetService extends AbstractService<Street> implements StreetServiceInterface{

    @Inject @StreetDaoQualifiers
    private StreetDaoInterface streetDaoInterface;
    
    @Override
    public GenericDaoInterface<Street> getDaoInterface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
