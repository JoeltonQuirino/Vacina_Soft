/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

    int count();

    void create(T entity);

    void edit(T entity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    void remove(T entity);
    
}
