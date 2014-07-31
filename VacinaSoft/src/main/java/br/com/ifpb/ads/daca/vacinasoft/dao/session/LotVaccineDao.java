/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.entities.LotVaccine;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@Stateless
public class LotVaccineDao extends AbstractGenericDao<LotVaccine> {
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
