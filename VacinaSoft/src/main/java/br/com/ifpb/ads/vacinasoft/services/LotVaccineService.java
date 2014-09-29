package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.LotVaccineDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.LotVaccineDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.LotVaccine;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class LotVaccineService extends AbstractService<LotVaccine> implements LotVaccineServiceInterface{

    @Inject @LotVaccineDaoQualifiers
    private LotVaccineDaoInterface lotVaccineDaoInterface;
    
    @Override
    public GenericDaoInterface<LotVaccine> getDaoInterface() {
        return lotVaccineDaoInterface;
    }
    
}
