package br.com.ifpb.ads.daca.vacinasoft.jsf;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.LoginDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.entities.UserSystems;
import java.io.IOException;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

/**
 *
 * @author MarkusPatriota
 */
@Named
@RequestScoped
public class LoginController {
    
    @Inject
    private LoginDaoInterface loginDaoInterface;
    private UserSystems userSystems;
    private static boolean usuarioLogado;
    
    public LoginController() {
        userSystems=new UserSystems();
    }
    
    @Transactional
    public void cadastro(){
        loginDaoInterface.createUserSystems(userSystems);
        
    }
    
    public void logar() throws IOException{
        
        if(estaLogado()){
            userTheSistems();
            
        }else FacesContext.getCurrentInstance().getExternalContext()
                .redirect("/VacinaSoft/login.xhtml");
        
    }
    
    public void tempoEncerrado() throws IOException {
        sair();
        
    }
    
    public void sair() throws IOException{
        usuarioLogado=false;
        userSystems= null;
        FacesContext.getCurrentInstance().getExternalContext()
                .invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext()
                .redirect("/VacinaSoft/login.xhtml");
    }
    
    private boolean estaLogado(){
        UserSystems loginAux = loginDaoInterface.findUserSystems(userSystems.getUsername(), userSystems.getUserpassword());
        if(loginAux != null){
            usuarioLogado=true;
            setUserSystems(loginAux);
            FacesContext ctx = FacesContext.getCurrentInstance();
             HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
                session.setAttribute("userSytems", loginAux);
            System.out.println("Usuario:"+loginAux.toString());
            return true;
        }else{
            usuarioLogado=false;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Senha ou Usuário inválidos", ""));
        }
        return false;
    }
    
    private boolean administrator(){
        return userSystems.getGrupsUsers().equals("Admin");
    }
    
    private boolean user(){
        return userSystems.getGrupsUsers().equals("User");
        
    }

    private void userTheSistems() throws IOException{
        if(administrator()){
            FacesContext.getCurrentInstance().getExternalContext()
                    .redirect("/VacinaSoft/admin/home.xhtml");
        }
         if(user()){
            FacesContext.getCurrentInstance().getExternalContext()
                    .redirect("/VacinaSoft/user/home.xhtml");
        }
    }
    
    public LoginDaoInterface getLoginDaoInterface() {
        return loginDaoInterface;
    }

    public void setLoginDaoInterface(LoginDaoInterface loginDaoInterface) {
        this.loginDaoInterface = loginDaoInterface;
    }

    public UserSystems getUserSystems() {
        return userSystems;
    }

    public void setUserSystems(UserSystems userSystems) {
        this.userSystems = userSystems;
    }

    public static boolean isUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(boolean usuarioLogado) {
        LoginController.usuarioLogado = usuarioLogado;
    }
    
}
