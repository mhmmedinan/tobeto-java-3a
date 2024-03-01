package com.tobeto.rentacar.business.rules;

import java.time.Year;

import org.springframework.stereotype.Service;

import com.tobeto.rentacar.core.exceptions.types.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ModelBusinessRules {

	
	public void CheckIfModelYearShouldNeInLast20Years(int year) {
		Year currentYear = Year.now();
		Year twentyYearsAgo = currentYear.minusYears(20);
		
		if(year<twentyYearsAgo.getValue()) {
			throw new BusinessException("Model Year should be in last 20 years");
		}
	}
}
