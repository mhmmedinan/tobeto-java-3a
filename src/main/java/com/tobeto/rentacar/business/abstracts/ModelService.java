package com.tobeto.rentacar.business.abstracts;

import java.util.List;

import com.tobeto.rentacar.business.requests.create.model.CreateModelRequest;
import com.tobeto.rentacar.business.responses.create.model.CreateModelResponse;
import com.tobeto.rentacar.business.responses.get.model.GetAllModelResponse;
import com.tobeto.rentacar.entities.concretes.Model;

public interface ModelService {

	CreateModelResponse add(CreateModelRequest request);
	List<GetAllModelResponse> getAll();
	GetAllModelResponse getByName(String name);
	List<GetAllModelResponse> findByName(String name);
	
}
