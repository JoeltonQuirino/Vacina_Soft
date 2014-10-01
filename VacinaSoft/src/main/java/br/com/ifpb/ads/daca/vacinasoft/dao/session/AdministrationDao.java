package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.AdministrationDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.AdministrationDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import com.uaihebert.factory.EasyCriteriaFactory;
import com.uaihebert.model.EasyCriteria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@AdministrationDaoQualifiers
@Stateless
public class AdministrationDao extends AbstractGenericDao<Administration> implements AdministrationDaoInterface{
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministrationDao() {
        super(Administration.class);
    }
    
    @Override
    public Long vaccinatedChildren(Integer monthsAgo){
        EasyCriteria<Administration> easyCriteria = EasyCriteriaFactory.createQueryCriteria(em, Administration.class);
        
        System.out.println(easyCriteria.toString());
        easyCriteria.getResultList();

        return easyCriteria.count();
    }
    
    
}
