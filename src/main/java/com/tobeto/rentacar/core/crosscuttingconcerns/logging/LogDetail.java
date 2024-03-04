package com.tobeto.rentacar.core.crosscuttingconcerns.logging;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "log_details")
public class LogDetail {

	@Id
	private String id;
	
	@Field("method_name")
	private String methodName;
	
	@Field("user")
	private String user;
	
	private List<LogParameter> parameters;
	
	
	
}
