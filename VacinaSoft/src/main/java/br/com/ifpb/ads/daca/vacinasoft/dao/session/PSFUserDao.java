package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.PSFUserDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.PSFUserDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.PSFUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@PSFUserDaoQualifiers
@Stateless
public class PSFUserDao extends AbstractGenericDao<PSFUser> implements PSFUserDaoInterface {
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PSFUserDao() {
        super(PSFUser.class);
    }

}
