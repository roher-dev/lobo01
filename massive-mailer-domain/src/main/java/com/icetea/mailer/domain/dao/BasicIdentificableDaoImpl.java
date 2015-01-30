package com.icetea.mailer.domain.dao;

import com.icetea.mailer.domain.model.Identifiable;

public abstract class BasicIdentificableDaoImpl<E extends Identifiable> extends BasicDaoImpl<E> 
	implements BasicIdentificableDao<E> {

	@SuppressWarnings("unchecked")
    @Override
    public E findById(Long id) {
        return (E) this.getCurrentSession().get(this.getEntityClass(), id);
    }
	
	@Override
    public boolean deleteById(Long id) {
        E e = this.findById(id);
        if (e != null) {
            this.delete(e);
        
            return true;
        }
        
        return false;
    }
	
}
