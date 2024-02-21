package com.tobeto.rentacar.business.responses.create.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelResponse {

	private int brandId;
	private String name;
	private LocalDateTime createdDate;
}
