package br.com.ifpb.ads.vacinasoft.services;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MarkusPatriota
 * @param <T>
 */
public interface ServiceInterface<T> extends Serializable{
    
    public int count();

    public void create(T entity);

    public void edit(T entity);

    public T find(Object id);

    public List<T> findAll();

    public List<T> findRange(int[] range);

    public void remove(T entity);
    
}
