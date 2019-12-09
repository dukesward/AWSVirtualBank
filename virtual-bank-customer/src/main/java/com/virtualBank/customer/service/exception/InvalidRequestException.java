package com.virtualBank.customer.service.exception;

public class InvalidRequestException extends ApplicationException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6823043419610133947L;

	public InvalidRequestException(String errorMessage) {
		super("Invalid request due to: " + errorMessage);
	}
}
