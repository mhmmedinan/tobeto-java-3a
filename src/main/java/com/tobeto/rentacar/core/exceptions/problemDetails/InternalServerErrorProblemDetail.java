package com.tobeto.rentacar.core.exceptions.problemDetails;

import org.springframework.http.HttpStatus;

public class InternalServerErrorProblemDetail extends ProblemDetails {

	public InternalServerErrorProblemDetail() {
		setTitle("Business Rule Violation");
		setType("http://tobeto.com/exceptions/internal");
		setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
	}
}
