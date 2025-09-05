package com.appsdeveloperblog.ws.emailnotification.exception;

public class NotRetryableException extends RuntimeException {

    public NotRetryableException() {
        super();
    }

    public NotRetryableException(String message) {
        super(message);
    }
}
