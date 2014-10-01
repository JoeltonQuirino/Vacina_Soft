package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.AreaDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.AreaDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Area;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * AreaDao writes the attributes referring to area table in the database.   
 * @author WitaloCarlos
 */
@AreaDaoQualifiers
@Stateless
public class AreaDao extends AbstractGenericDao<Area> implements AreaDaoInterface{
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaDao() {
        super(Area.class);
    }
    
}
