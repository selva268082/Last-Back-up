package com.theervu.error;

import java.util.List;

public class BaseRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4847695028146201069L;
    
	private final List<String> errorCodes;
    private final Object baseRequest;
	
    public BaseRuntimeException(List<String> errorCodes, Object baseReq) {
		super();
		this.errorCodes = errorCodes;
		this.baseRequest=baseReq;
	}
	/**
	 * @return the errorCodes
	 */
	public List<String> getErrorCodes() {
		return errorCodes;
	}

	/**
	 * @return the baseRequest
	 */
	public Object getBaseRequest() {
		return baseRequest;
	}
	
	
}
