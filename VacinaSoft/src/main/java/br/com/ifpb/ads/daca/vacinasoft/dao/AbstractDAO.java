/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpb.ads.daca.vacinasoft.dao;

import br.com.ifpb.ads.daca.vacinasoft.entities.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author WitaloCarlos
 * @param <T>
 */
public abstract class AbstractDAO<T extends AbstractEntity> {

    protected static EntityManager entityManager;

    static {
        EntityManagerFactory entityFabrica = Persistence.createEntityManagerFactory("br.com.ifpb.ads.daca_VacinaSoft_war_1.0-SNAPSHOTPU");
        entityManager = entityFabrica.createEntityManager();
    }

    public T getById(int id) {
        return (T) entityManager.find(getTypeClass(), id);
    }

    public void save(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public void update(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            entityManager.getTransaction().rollback();
        }
    }

    public void delete(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
            entityManager.getTransaction().rollback();
        }
    }

    public List<T> findAll() {
        return entityManager.createQuery(("From " + getTypeClass().getName()))
                .getResultList();
    }

    private Class<?> getTypeClass() {
        // TODO Auto-generated method stub
        Class<?> classes = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];

        return classes;
    }

}
