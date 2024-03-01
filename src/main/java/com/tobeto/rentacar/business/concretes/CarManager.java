package com.tobeto.rentacar.business.concretes;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.tobeto.rentacar.business.abstracts.CarService;
import com.tobeto.rentacar.business.requests.create.car.CreateCarRequest;
import com.tobeto.rentacar.business.responses.create.car.CreateCarResponse;
import com.tobeto.rentacar.business.rules.ModelBusinessRules;
import com.tobeto.rentacar.core.utilities.mapping.ModelMapperService;
import com.tobeto.rentacar.core.utilities.results.DataResult;
import com.tobeto.rentacar.core.utilities.results.SuccessDataResult;
import com.tobeto.rentacar.dataAccess.abstracts.CarRepository;
import com.tobeto.rentacar.entities.concretes.Car;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
	
	private CarRepository carRepository;
	private ModelMapperService mapperService;
	private ModelBusinessRules rules;

	@Override
	public DataResult<CreateCarResponse> add(CreateCarRequest request) {
		rules.CheckIfModelYearShouldNeInLast20Years(request.getModelYear());
		Car car = mapperService.forRequest().map(request, Car.class);
		car.setCreatedDate(LocalDateTime.now());
		carRepository.save(car);

		CreateCarResponse response = mapperService.forResponse().map(car, CreateCarResponse.class);
		return new SuccessDataResult<CreateCarResponse>(response, "Successfully");
	}

}
