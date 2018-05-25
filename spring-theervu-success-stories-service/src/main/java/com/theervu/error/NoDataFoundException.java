package com.theervu.error;

import java.util.List;

public class NoDataFoundException extends BaseRuntimeException {

	public NoDataFoundException(List<String> errorCodes, Object baseReq) {
		super(errorCodes, baseReq);
		 
	}

}
