package com.encore.exception;

public class InvalidInputException extends Exception{
	public InvalidInputException() {
		this("유효하지 않습니다!");
	}
	public InvalidInputException(String message) {
		super(message);
	}

}
