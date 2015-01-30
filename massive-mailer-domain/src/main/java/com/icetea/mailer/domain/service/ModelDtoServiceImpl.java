package com.icetea.mailer.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import com.icetea.mailer.api.dto.BasicDto;
import com.icetea.mailer.domain.dao.BasicDao;
import com.icetea.mailer.domain.model.Model;
import com.icetea.mailer.domain.transformer.DtoModelTransformer;

@Transactional
public abstract class ModelDtoServiceImpl<E extends Model, 
		D extends BasicDao<E>, O extends BasicDto, 
		T extends DtoModelTransformer<O, E>> 
		extends BasicServiceImpl 
	implements ModelDtoService<E, O> {
	
	private final D dao;
	private final T transformer;

	public ModelDtoServiceImpl(D dao, T transformer) {
		super();
		this.dao = dao;
		this.transformer = transformer;
	}

	public List<O> searchAll(){
		return this.transformer.transformAllTo(
				this.dao.findAll());
	}
	
	protected D getDao() {
		return dao;
	}
	
	protected T getTransformer() {
		return transformer;
	}	
	
	public boolean insert(O dto){
		return this.dao.save(this.transformer.transform(dto));
	}
	
}
