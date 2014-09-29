package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.LotVaccineDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.LotVaccineDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.LotVaccine;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@LotVaccineDaoQualifiers
@Stateless
public class LotVaccineDao extends AbstractGenericDao<LotVaccine> implements LotVaccineDaoInterface {
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LotVaccineDao() {
        super(LotVaccine.class);
    }
    
}
