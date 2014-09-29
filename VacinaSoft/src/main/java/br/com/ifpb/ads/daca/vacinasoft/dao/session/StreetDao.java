package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.StreetDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.StreetDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Street;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@StreetDaoQualifiers
@Stateless
public class StreetDao extends AbstractGenericDao<Street> implements StreetDaoInterface {
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StreetDao() {
        super(Street.class);
    }
    
}
