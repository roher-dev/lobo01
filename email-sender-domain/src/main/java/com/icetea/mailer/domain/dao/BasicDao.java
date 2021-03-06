package com.icetea.mailer.domain.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import com.icetea.mailer.domain.model.Model;

public interface BasicDao<E extends Model> {

    boolean save(E e);

    boolean saveOrUpdate(E e);

    boolean delete(E e);

    List<E> findByCriteria(Criterion criterion);

    List<E> findAll();

    List<E> findAll(Integer maxResults);

    E findUniqueByCriteria(Criterion criterion);

    boolean saveOrUpdate(E e, boolean flush);
    
    boolean refresh(E e);

}
