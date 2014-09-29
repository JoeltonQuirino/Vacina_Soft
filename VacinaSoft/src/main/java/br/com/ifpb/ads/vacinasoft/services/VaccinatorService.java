package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.VaccinatorDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.VaccinatorDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Vaccinator;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class VaccinatorService extends AbstractService<Vaccinator> implements VaccinatorServiceInterface{

    @Inject @VaccinatorDaoQualifiers
    private VaccinatorDaoInterface vaccinatorDaoInterface;
    
    @Override
    public GenericDaoInterface<Vaccinator> getDaoInterface() {
        return vaccinatorDaoInterface;
    }
    
}
