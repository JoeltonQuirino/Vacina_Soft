/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import br.com.ifpb.ads.daca.vacinasoft.dao.AdministrationDAO;
import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;

/**
 *
 * @author Joelton
 */
public class NewClass {
    
    public static void main(String[] args) {
        
        AdministrationDAO adm = new AdministrationDAO();
        Administration adim = new Administration();
        adm.save(adim);
    }
}
