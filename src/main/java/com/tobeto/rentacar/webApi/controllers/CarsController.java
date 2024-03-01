package com.tobeto.rentacar.webApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.rentacar.business.abstracts.CarService;
import com.tobeto.rentacar.business.requests.create.car.CreateCarRequest;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController extends BaseController {

	private CarService carService;
	
	
	@PostMapping
	public ResponseEntity<?> add(CreateCarRequest carRequest){
		return handleDataResult(carService.add(carRequest));
	}
}
