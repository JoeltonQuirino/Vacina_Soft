/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.dao.interfaces;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.*;

/**
 *
 * @author Hugo
 */
public interface DaoInterface {
    
    public AdministrationFacade createAdministrationFacade();
    public AreaFacade createAreaFacade ();
    public HealthAgentFacade createHealthAgentFacade();
    public LotVaccineFacade createLotVaccineFacade();
    public PSFUserFacade createPSFUserFacade();
    public StreetFacade createStreetFacade();
    public VaccinatorFacade createVaccinatorFacade();
    public VaccineFacade cretateVaccineFacade();
   
}
