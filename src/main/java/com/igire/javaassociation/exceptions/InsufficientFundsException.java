package com.igire.javaassociation.exceptions;

public class InsufficientFundsException extends TransactionException {

    public InsufficientFundsException() {
        super("INS-001", "Insufficient Funds");
    }
}