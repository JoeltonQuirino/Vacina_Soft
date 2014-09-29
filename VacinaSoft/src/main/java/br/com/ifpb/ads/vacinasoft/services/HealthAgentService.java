package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.HealthAgentDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.HealthAgentDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.HealthAgent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class HealthAgentService extends AbstractService<HealthAgent> implements HealthAgentServiceInterface{

    @Inject @HealthAgentDaoQualifiers
    private HealthAgentDaoInterface agentDaoInterface;
    
    @Override
    public GenericDaoInterface<HealthAgent> getDaoInterface() {
       return agentDaoInterface;
    }
    
}
