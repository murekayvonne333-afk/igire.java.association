package com.igire.javaassociation.exceptions;

public class TransactionException extends Exception {

    private String errorCode;

    public TransactionException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}