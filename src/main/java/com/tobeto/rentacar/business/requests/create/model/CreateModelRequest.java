package com.tobeto.rentacar.business.requests.create.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {

	private int brandId;
	private String name;
}
