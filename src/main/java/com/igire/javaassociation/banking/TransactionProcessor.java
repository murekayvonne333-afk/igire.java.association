package com.igire.javaassociation.banking;

import com.igire.javaassociation.exceptions.*;

public class TransactionProcessor {

    public void processTransaction(double amount)
            throws TransactionException {

        if (amount > 10000) {
            throw new FraudDetectedException();
        }

        if (amount > 5000) {
            throw new InsufficientFundsException();
        }

        System.out.println("Transaction Successful");
    }
}