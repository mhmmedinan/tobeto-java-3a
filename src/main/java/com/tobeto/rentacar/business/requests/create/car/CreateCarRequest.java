package com.tobeto.rentacar.business.requests.create.car;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCarRequest {

	@Positive
	private int modelId;

	@Min(2004)
	@Max(2030)
	private int modelYear;

	@NotEmpty(message="plate cannot be empty")
	@Size(min=5,message="plate can be at least 5 characters")
	private String plate;

	@Max(3)
	private int state; //1-Available 2-Rented 3-Under Maintance

	@Positive
	private double dailyPrice;
}
