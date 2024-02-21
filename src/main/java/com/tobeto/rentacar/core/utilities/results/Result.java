package com.tobeto.rentacar.core.utilities.results;

public class Result {

	private boolean success; //true
	private String message; //eklendi
	
	public Result(boolean success) {
		this.success=success;
	}
	
	public Result(boolean success,String message) {
		this(success);
		this.message=message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public String getMessage() {
		return message;
	}
	
}
