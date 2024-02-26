package com.tobeto.rentacar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.rentacar.business.abstracts.ModelService;
import com.tobeto.rentacar.business.requests.create.model.CreateModelRequest;
import com.tobeto.rentacar.business.responses.create.model.CreateModelResponse;
import com.tobeto.rentacar.business.responses.get.model.GetAllModelResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/models") //localhost:8082/api/models
@AllArgsConstructor
public class ModelsController {

	private ModelService modelService;
	
	@PostMapping
	public CreateModelResponse add(@RequestBody CreateModelRequest request) {
		return modelService.add(request);
	}
	
	
	@GetMapping
	public List<GetAllModelResponse> getAll() {
		return modelService.getAll();
	}
	
	@GetMapping("/getbyname/{name}")
	public GetAllModelResponse getByName(@PathVariable String name) {
		return modelService.getByName(name);
	}
	
	@GetMapping("/findbyname/{name}")
	public List<GetAllModelResponse> findByName(@PathVariable String name) {
		return modelService.findByName(name);
	}
}
