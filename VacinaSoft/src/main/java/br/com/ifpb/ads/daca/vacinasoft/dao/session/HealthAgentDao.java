package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.HealthAgentDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.HealthAgentDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.HealthAgent;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * HealthAgentDao writes the data to the database HealthAgent.
 * @author WitaloCarlos
 */
@HealthAgentDaoQualifiers
@Stateless
public class HealthAgentDao extends AbstractGenericDao<HealthAgent> implements HealthAgentDaoInterface {
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HealthAgentDao() {
        super(HealthAgent.class);
    }
    
}
