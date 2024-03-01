package com.tobeto.rentacar.business.abstracts;

import com.tobeto.rentacar.business.requests.create.car.CreateCarRequest;
import com.tobeto.rentacar.business.responses.create.car.CreateCarResponse;
import com.tobeto.rentacar.core.utilities.results.DataResult;

public interface CarService {

	DataResult<CreateCarResponse> add(CreateCarRequest request);
}
