package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.VaccinatorDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.VaccinatorDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccinator;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * VaccinatorDao writes the data to the database Vaccinator.
 * @author WitaloCarlos
 */
@VaccinatorDaoQualifiers
@Stateless
public class VaccinatorDao extends AbstractGenericDao<Vaccinator> implements VaccinatorDaoInterface{
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VaccinatorDao() {
        super(Vaccinator.class);
    }
    
}
