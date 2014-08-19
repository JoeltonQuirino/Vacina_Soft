/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.ads.daca.vacinasoft.dao.test;

import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import br.com.ifpb.ads.daca.vacinasoft.jsf.AdministrationController;


/**
 *
 * @author Prontonet
 */
public class TestImplAdm {
    
    private Administration adm;
    private String cnes;
    private String psfAdm;
    private String vaccineDose;
    
    private AdministrationController admCtrl;

    public TestImplAdm() {
        adm = new Administration();
    }
    
    
    
    private void implAdm(){
        adm.setCnes(cnes);
        adm.setPsfAdministration(psfAdm);
        adm.setVaccineDose(vaccineDose);
    }   
    
    
    public void createAdm(){
        implAdm();
        admCtrl.setSelected(adm);
        admCtrl.create();
    }
}
