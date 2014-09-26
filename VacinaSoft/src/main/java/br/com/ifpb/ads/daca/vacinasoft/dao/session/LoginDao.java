package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.LoginDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.entities.UserSystems;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MarkusPatriota
 */

@Stateless
public class LoginDao extends AbstractGenericDaoLogin<UserSystems> implements LoginDaoInterface{

    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager entityManager;
    
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
    public LoginDao() {
        super(UserSystems.class);
    }  
    
}
