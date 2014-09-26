package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author MarkusPatriota
 * @param <UserSystems>
 */
public abstract class AbstractGenericDaoLogin<UserSystems> {

    private Class<UserSystems> entityClass;

    public AbstractGenericDaoLogin (Class<UserSystems> entityClass) {
        this.entityClass = entityClass;
    }

    public abstract EntityManager getEntityManager();

    public void createUserSystems(UserSystems login) {
        getEntityManager().persist(login);
    }

    public UserSystems findUserSystems(String usuario, String senha) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<UserSystems> c = cb.createQuery(entityClass);

        Root<UserSystems> login = c.from(entityClass);
        c.distinct(true).where(cb.equal(login, login));

        c.where(cb.equal(login.get("username"), cb.parameter(String.class, "username")),
                cb.and(cb.equal(login.get("userpassword"), cb.parameter(String.class, "userpassword"))));

        TypedQuery q = getEntityManager().createQuery(c);
        q.setParameter("username", usuario);
        q.setParameter("userpassword", senha);

        UserSystems loginAux = null;
        try {
            loginAux = (UserSystems) q.getSingleResult();

        } catch (NoResultException nre) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Senha ou Usuário inválidos", ""));
            System.out.println("Usuário não encontrado");
        }
        return loginAux;
    }

}
