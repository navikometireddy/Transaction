package com.example.exceptions;

public class DateInvalidFormatException extends Exception{

	private static final long serialVersionUID = 1L;

	public DateInvalidFormatException(String message) {
		super(message);
	}
	
}
