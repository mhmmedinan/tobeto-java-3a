package com.tobeto.rentacar.wepApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.rentacar.business.abstracts.BrandService;
import com.tobeto.rentacar.business.requests.create.brand.CreateBrandRequest;
import com.tobeto.rentacar.business.responses.get.brand.GetBrandResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController extends BaseController {
	
	private BrandService brandService;
	
	@PostMapping()
	public ResponseEntity<?> add(@RequestBody CreateBrandRequest request) {
        return handleDataResult(brandService.add(request));
	}
	
	@GetMapping("getall")
	public ResponseEntity<?> getAll(){
		return handleDataResult(brandService.getAll());
	}
	
	@GetMapping("getbyid/{id}")
	public GetBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}

}
