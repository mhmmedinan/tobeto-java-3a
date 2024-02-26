package com.tobeto.rentacar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tobeto.rentacar.core.exceptions.BusinessException;
import com.tobeto.rentacar.core.utilities.results.ErrorDataResult;

@SpringBootApplication
@RestControllerAdvice
public class RentacarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentacarApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleBusinessException(BusinessException businessException){
		ErrorDataResult<Object> errorDataResult = 
				new ErrorDataResult<Object>(businessException.getMessage(),"BUSINESS.EXCEPTION");
		return errorDataResult;
	}
	

}



