package br.com.ifpb.ads.daca.vacinasoft.dao.interfaces;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.*;

/**
 * DaoInterface
 * @author Hugo Correia & Mauricio Aguiar
 */
public interface DaoInterface {
    
    public AdministrationDao createAdministrationFacade();
    public AreaDao createAreaFacade ();
    public HealthAgentDao createHealthAgentFacade();
    public LotVaccineDao createLotVaccineFacade();
    public PSFUserDao createPSFUserFacade();
    public StreetDao createStreetFacade();
    public VaccinatorDao createVaccinatorFacade();
    public VaccineDao cretateVaccineFacade();
   
}