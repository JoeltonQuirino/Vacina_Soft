package br.com.ifpb.ads.daca.vacinasoft.dao.session;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.AdministrationDaoInterface;
import br.com.ifpb.ads.daca.vacinasoft.dao.session.qualifiers.AdministrationDaoQualifiers;
import br.com.ifpb.ads.daca.vacinasoft.entities.Administration;
import com.uaihebert.factory.EasyCriteriaFactory;
import com.uaihebert.model.EasyCriteria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author WitaloCarlos
 */
@AdministrationDaoQualifiers
@Stateless
public class AdministrationDao extends AbstractGenericDao<Administration> implements AdministrationDaoInterface{
    @PersistenceContext(unitName = "br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministrationDao() {
        super(Administration.class);
    }
    
    @Override
    public Long vaccinatedChildren(Integer monthsAgo){
        EasyCriteria<Administration> easyCriteria = EasyCriteriaFactory.createQueryCriteria(em, Administration.class);
        easyCriteria.innerJoin("administration.psfUser");
        easyCriteria.andEquals("administration.administrationDate", "28/09/2014");
        System.out.println(easyCriteria.toString());
        easyCriteria.getResultList();
//        Calendar dateOrder = Calendar.getInstance(); //cria a data corrente data atual
//        Calendar startDate = Calendar.getInstance(); 
//        startDate.add(Calendar.MONTH, monthsAgo);
//        Date dataMenosMeses = dateOrder.getTime();  
//        //System.out.println(dataMenosMeses.toString());
//        
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<PSFUser> c = cb.createQuery(PSFUser.class);
//
//        /**
//         * Podemos ter várias entidades informadas na clausula FROM.
//         */
//        Root<PSFUser> cliente = c.from(PSFUser.class);
//        Root<Administration> venda = c.from(Administration.class);
//
//        /**
//         * Criado dois parâmetros (ParameterExpression<T>) para representar o período.
//         */
//        ParameterExpression<Date> dataInicio = cb.parameter(Date.class, "startDate");
//        ParameterExpression<Date> dataFim = cb.parameter(Date.class, "dateOrder");
//
//        /**
//         * A partir do CriteriaBuilder podemos chamar o método between() passando qual o campo data entidade e os parâmetros que serão passados.
//         */
//        Expression<Date> data = venda.get("data");
//        c.where(cb.between(data, dataInicio, dataFim),cb.and(cb.equal(cliente, 
//                venda.get("cliente")))).distinct(true);
//
//        System.out.println(c.toString());
//        TypedQuery q = em.createQuery(c);
//        q.setParameter("startDate", startDate);
//        q.setParameter("dateOrder", dateOrder);
        return easyCriteria.count();
    }
    
    
}
