package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.AreaDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.AreaDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Area;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author MarkusPatriota
 */
@SessionScoped
public class AreaService extends AbstractService<Area> implements AreaServiceInterface{

    @Inject @AreaDaoQualifiers
    private AreaDaoInterface areaDaoInterface;
    
    @Override
    public GenericDaoInterface<Area> getDaoInterface() {
        return areaDaoInterface;
    }
    
}
