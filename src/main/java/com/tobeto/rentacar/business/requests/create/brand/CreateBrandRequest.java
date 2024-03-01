package com.tobeto.rentacar.business.requests.create.brand;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBrandRequest {

	@NotEmpty(message="Brand name cannot be empty")
	@Size(min=2,message="Brand name can be at least 2 characters")
	private String name;
	
}
