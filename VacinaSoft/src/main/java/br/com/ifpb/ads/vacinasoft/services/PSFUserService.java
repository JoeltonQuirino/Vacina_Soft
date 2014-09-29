package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.PSFUserDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.PSFUserDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.PSFUser;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class PSFUserService extends AbstractService<PSFUser> implements PSFUserServiceInterface{

    @Inject @PSFUserDaoQualifiers
    private PSFUserDaoInterface pSFUserDaoInterface; 
    
    @Override
    public GenericDaoInterface<PSFUser> getDaoInterface() {
        return pSFUserDaoInterface;
    }
    
}
