package com.cts.angularboot.util;

public class CustomErrorType {
	
	private String errorMsg;
	
	public CustomErrorType(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public String getMessage(){
		return errorMsg;
	}
}
