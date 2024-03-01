package com.tobeto.rentacar.business.requests.create.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCarRequest {

	private int modelId;

	private int modelYear;
	

	private String plate;
	

	private int state; //1-Available 2-Rented 3-Under Maintance
	

	private double dailyPrice;
}
