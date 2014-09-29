package br.com.ifpb.ads.vacinasoft.services;

import br.com.ifpb.ads.daca.vacinasoft.dao.interfaces.GenericDaoInterface;
import java.util.List;

/**
 *
 * @author MarkusPatriota
 * @param <T>
 */
public abstract class AbstractService<T> implements ServiceInterface<T>{
 
    public abstract GenericDaoInterface<T> getDaoInterface();
    

    @Override
    public void create(T entity){
        getDaoInterface().create(entity);
    }

    @Override
    public void edit(T entity){
        getDaoInterface().edit(entity);
    }
    @Override
    public void remove(T entity){
        getDaoInterface().remove(entity);
    }

    @Override
    public int count(){
        return getDaoInterface().count();
    }
    @Override
    public T find(Object id){
        return getDaoInterface().find(id);
    }

    @Override
    public List<T> findAll(){
        return getDaoInterface().findAll();
    }

    @Override
    public List<T> findRange(int[] range){
        return getDaoInterface().findRange(range);
    }

}
