package com.virtualBank.customer.service.exception;

public class CustomerAuthorizationError extends ApplicationException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7805765545485999329L;
	
	public CustomerAuthorizationError(String errorMessage) {
		super("Authorization error due to: " + errorMessage);
	}
}
