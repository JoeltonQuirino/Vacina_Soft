package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.VaccineDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccine;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@Stateless
public class VaccineDao extends AbstractGenericDao<Vaccine> implements VaccineDaoInterface{
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VaccineDao() {
        super(Vaccine.class);
    }
    
}
