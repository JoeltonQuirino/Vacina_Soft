package br.com.ifpb.ads.daca.vacinasoft.dao.interfaces;

import br.com.ifpb.ads.daca.vacinasoft.entities.UserSystems;

/**
 * LoginDaoInterface has the signature of methods UserSystems.
 * @author MarkusPatriota
 */
public interface LoginDaoInterface {
    
    public void createUserSystems(UserSystems login);
    public UserSystems findUserSystems(String usuario, String senha);
    
}
