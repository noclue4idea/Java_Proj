package com.prtc;

public class CustomException extends Exception{
	
	public CustomException(String message,Throwable error)
	{
		super(message+"::"+error);
	}

}
