package com.icetea.mailer.domain.service;

import java.util.List;

import com.icetea.mailer.api.dto.BasicDto;
import com.icetea.mailer.domain.model.Model;

public interface ModelDtoService<E extends Model, O extends BasicDto> 
	extends BasicService {

	O searchById(Long id);
	
	List<O> searchAll();
	
	boolean insert(O dto);
	
	boolean remove(Long id);
}
