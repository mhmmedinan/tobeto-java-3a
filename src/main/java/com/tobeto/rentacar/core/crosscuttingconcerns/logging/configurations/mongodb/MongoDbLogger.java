package com.tobeto.rentacar.core.crosscuttingconcerns.logging.configurations.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.tobeto.rentacar.core.crosscuttingconcerns.logging.LogDetail;
import com.tobeto.rentacar.core.crosscuttingconcerns.logging.LogParameter;
import com.tobeto.rentacar.core.crosscuttingconcerns.logging.LoggerServiceBase;

@Service
public class MongoDbLogger extends LoggerServiceBase {
	
	private MongoTemplate mongoTemplate;
	
	@Autowired
	public MongoDbLogger(MongoTemplate mongoTemplate) {
		super(MongoDbLogger.class);
		this.mongoTemplate=mongoTemplate;
	}

	@Override
	public void log(String methodName, List<LogParameter> logParameters, String userName) {
		LogDetail detail = new LogDetail();
		detail.setMethodName(methodName);
		detail.setParameters(logParameters);
		detail.setUser(userName);
		info(detail.toString());
		mongoTemplate.save(detail);
		
	}

}
