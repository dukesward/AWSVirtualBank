package com.virtualBank.customer.service.exception;

public class InvalidCredentialException extends CustomerAuthorizationError {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4648977071972740212L;

	public InvalidCredentialException() {
		super("Invalid credentials");
	}
}
