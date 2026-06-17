package com.igire.javaassociation.csv;

public class ParseError {

    private String line;
    private String reason;

    public ParseError(String line, String reason) {
        this.line = line;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return line + " : " + reason;
    }
}