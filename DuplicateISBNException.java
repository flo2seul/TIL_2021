package com.encore.exception;

public class DuplicateISBNException extends Exception{
	public DuplicateISBNException() {
		this("isbn이 중복되었습니다!");
	}
    public DuplicateISBNException(String message) {
    	super(message);
    }
}
