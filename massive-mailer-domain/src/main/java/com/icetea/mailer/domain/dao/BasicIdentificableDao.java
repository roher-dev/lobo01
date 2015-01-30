package com.icetea.mailer.domain.dao;

import com.icetea.mailer.domain.model.Identifiable;

public interface BasicIdentificableDao<E extends Identifiable> extends BasicDao<E>{
	
	E findById(Long id);
	
	boolean deleteById(Long id);
	
}
