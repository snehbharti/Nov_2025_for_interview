package com.yourcompany.tests.base;

public class BrowserNotSupportedException extends RuntimeException {
	public BrowserNotSupportedException(String message) {
		super(message);
	}
}
