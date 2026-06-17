package com.igire.javaassociation.exceptions;

public class FraudDetectedException extends TransactionException {

    public FraudDetectedException() {
        super("FRD-001", "Fraud Detected");
    }
}