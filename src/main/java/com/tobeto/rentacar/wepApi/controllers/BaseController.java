package com.tobeto.rentacar.wepApi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.rentacar.core.utilities.results.DataResult;

@RestController
public class BaseController {

	public ResponseEntity<?> handleDataResult(DataResult<?> dataResult) {
		if(dataResult.isSuccess()) {
			return ResponseEntity.ok(dataResult);
		}
		return ResponseEntity.badRequest().body(dataResult);
	}
}
