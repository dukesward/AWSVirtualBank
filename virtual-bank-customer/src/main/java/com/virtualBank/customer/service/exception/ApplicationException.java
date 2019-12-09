package com.virtualBank.customer.service.exception;

import java.util.HashMap;
import java.util.Map;

public class ApplicationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3571937854420159722L;

	public ApplicationException(String errorMessage) {
		super(errorMessage);
	}
	
	public Map<String, Object> buildResponseMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("details", this.getMessage());
		return map;
	}
}
