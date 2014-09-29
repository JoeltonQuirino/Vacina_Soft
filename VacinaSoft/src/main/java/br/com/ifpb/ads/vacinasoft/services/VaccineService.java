package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.VaccineDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.VaccineDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccine;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class VaccineService extends AbstractService<Vaccine> implements VaccineServiceInterface{
    
    @Inject @VaccineDaoQualifiers
    private VaccineDaoInterface vaccineDaoInterface;
    
    @Override
    public GenericDaoInterface<Vaccine> getDaoInterface() {
        return vaccineDaoInterface;
    }
    
}
