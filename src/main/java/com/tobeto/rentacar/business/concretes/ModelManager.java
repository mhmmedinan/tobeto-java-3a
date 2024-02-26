package com.tobeto.rentacar.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tobeto.rentacar.business.abstracts.ModelService;
import com.tobeto.rentacar.business.requests.create.model.CreateModelRequest;
import com.tobeto.rentacar.business.responses.create.model.CreateModelResponse;
import com.tobeto.rentacar.business.responses.get.model.GetAllModelResponse;
import com.tobeto.rentacar.core.utilities.mapping.ModelMapperService;
import com.tobeto.rentacar.dataAccess.abstracts.ModelRepository;
import com.tobeto.rentacar.entities.concretes.Model;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

	private final ModelRepository modelRepository;
	private final ModelMapperService mapperService;

	@Override
	public CreateModelResponse add(CreateModelRequest request) {

		Model model = mapperService.forRequest().map(request, Model.class);
		model.setCreatedDate(LocalDateTime.now());
		Model createdModel = modelRepository.save(model);

		CreateModelResponse response = mapperService.forResponse().map(createdModel, CreateModelResponse.class);
		return response;

	}

	@Override
	public List<GetAllModelResponse> getAll() {
		List<Model> models = modelRepository.findAll();
		List<GetAllModelResponse> responses = models.stream()
				.map(model -> mapperService.forResponse().map(model, GetAllModelResponse.class))
				.collect(Collectors.toList());
		return responses;

	}

	@Override
	public GetAllModelResponse getByName(String name) {
		Model model = modelRepository.findByName(name);
		GetAllModelResponse response = mapperService.forResponse()
				.map(model, GetAllModelResponse.class);
		return response;
	}

	@Override
	public List<GetAllModelResponse> findByName(String name) {
		List<Model> models = modelRepository.getByNameIgnoreCase(name.trim());
		List<GetAllModelResponse> responses = models.stream()
				.map(model -> mapperService.forResponse().map(model, GetAllModelResponse.class))
				.collect(Collectors.toList());
		return responses;
	}

}
