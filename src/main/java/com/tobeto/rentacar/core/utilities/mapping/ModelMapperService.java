package com.tobeto.rentacar.core.utilities.mapping;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {

	ModelMapper forRequest();
	ModelMapper forResponse();
}
