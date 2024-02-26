package com.tobeto.rentacar.core.exceptions.problemDetails;

import java.util.Map;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ValidationProblemDetails extends ProblemDetails{

	public ValidationProblemDetails() {
		setTitle("Validation Rule Violation");
		setDetail("Validation Problem");
		setType("http://tobeto.com/exceptions/validation");
		setStatus(HttpStatus.BAD_REQUEST.toString());
		
	}
	
	private Map<String,String> errors;
}
