package br.com.ifpb.ads.daca.vacinasoft.dao.interfaces;

import java.util.List;

/**
 * This interface have the fuction to separate the client to logical business
 * It is  being implemented on the abstract class AbstractGenericDao
 * 
 * @author Mauricio Aguiar & Hugo Correia
 * @param <T>
 */
public interface GenericDaoInterface<T> {

    public int count();

    public void create(T entity);

    public void edit(T entity);

    public T find(Object id);

    public List<T> findAll();

    public List<T> findRange(int[] range);

    public void remove(T entity);
    
}
