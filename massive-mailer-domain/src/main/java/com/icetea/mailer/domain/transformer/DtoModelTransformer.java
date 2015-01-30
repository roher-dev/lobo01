package com.icetea.mailer.domain.transformer;

import java.util.List;

import com.icetea.mailer.api.dto.BasicDto;
import com.icetea.mailer.domain.model.Model;

public interface DtoModelTransformer<D extends BasicDto, E extends Model> {

    E transform(D dto);

    D transform(E e);

    D transform(E e, int depth);

    List<E> transformAllFrom(List<D> dtos);

    List<D> transformAllTo(List<E> entities);

    List<D> transformAllTo(List<E> entities, int depth);

}
