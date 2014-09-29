package br.com.ifpb.ads.daca.vacinasoft.jsf;

import br.com.ifpb.ads.daca.vacinasoft.entities.LotVaccine;
import br.com.ifpb.ads.daca.vacinasoft.jsf.util.JsfUtil;
import br.com.ifpb.ads.daca.vacinasoft.jsf.util.JsfUtil.PersistAction;
import br.com.ifpb.ads.vacinasoft.services.LotVaccineServiceInterface;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

@Named("lotVaccineController")
@SessionScoped
public class LotVaccineController implements Serializable {

    @Inject
    private LotVaccineServiceInterface ejbFacade;
    private List<LotVaccine> items = null;
    private LotVaccine selected;

    public LotVaccineController() {
    }

    public LotVaccine getSelected() {
        return selected;
    }

    public void setSelected(LotVaccine selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private LotVaccineServiceInterface getFacade() {
        return ejbFacade;
    }

    public LotVaccine prepareCreate() {
        selected = new LotVaccine();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/resources/Bundle").getString("LotVaccineCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/resources/Bundle").getString("LotVaccineUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/resources/Bundle").getString("LotVaccineDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<LotVaccine> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/resources/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/resources/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public LotVaccine getLotVaccine(long id) {
        return (LotVaccine)getFacade().find(id);
    }

    public List<LotVaccine> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<LotVaccine> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = LotVaccine.class)
    public static class LotVaccineControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LotVaccineController controller = (LotVaccineController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "lotVaccineController");
            return controller.getLotVaccine(getKey(value));
        }

        long getKey(String value) {
            long key;
            key = Long.parseLong(value);
            return key;
        }

        String getStringKey(long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof LotVaccine) {
                LotVaccine o = (LotVaccine) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), LotVaccine.class.getName()});
                return null;
            }
        }

    }

}
