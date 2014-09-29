package br.com.ifpb.ads.daca.vacinasoft.security;

import br.com.ifpb.ads.daca.vacinasoft.entities.UserSystems;
import br.com.ifpb.ads.daca.vacinasoft.jsf.LoginController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MarkusPatriota
 */
public class LoginPhaseListener implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext facesContext = event.getFacesContext();
        String currentPage = facesContext.getViewRoot().getViewId();
        
        boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml") > -1);
        boolean isLoginPageAdmin = (currentPage.lastIndexOf("/admin/*") > -1);
        boolean isLoginPageUser = (currentPage.lastIndexOf("/user/*") > -1);

        
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        //Object currentUser = session.getAttribute("userSytems");
        UserSystems userSystems = (UserSystems) session.getAttribute("userSytems");
        
        if(LoginController.isUsuarioLogado() && userSystems.getGrupsUsers().equals("Admin")&& isLoginPageUser){
            try {
                FacesContext.getCurrentInstance().getExternalContext()
                        .redirect("/VacinaSoft/admin/home.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginPhaseListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(LoginController.isUsuarioLogado() && userSystems.getGrupsUsers().equals("User")&& isLoginPageAdmin){
            try {
                FacesContext.getCurrentInstance().getExternalContext()
                        .redirect("/VacinaSoft/user/home.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginPhaseListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!isLoginPage && userSystems == null && !LoginController.isUsuarioLogado()) {
            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
            nh.handleNavigation(facesContext, null, "loginPage");
        }
        
    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW; 
    }
 
    
    
    
}
