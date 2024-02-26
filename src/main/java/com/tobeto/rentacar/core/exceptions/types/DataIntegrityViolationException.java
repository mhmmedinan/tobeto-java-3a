package com.tobeto.rentacar.core.exceptions.types;

public class DataIntegrityViolationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3166020630488757114L;
	
	public DataIntegrityViolationException(String message) {
		super(message);
	}

}
