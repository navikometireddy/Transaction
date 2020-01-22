package com.example.exceptions;

public class FileNotAllowedException extends Exception{

	private static final long serialVersionUID = 1L;

	public FileNotAllowedException(String message) {
        super(message);
    }
}
