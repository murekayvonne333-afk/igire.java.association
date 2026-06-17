package com.igire.javaassociation.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvTransactionProcessor {

    public void process(String filePath) {

        int success = 0;
        int failed = 0;

        List<ParseError> errors = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");

                if (values.length < 3) {
                    errors.add(new ParseError(line, "Malformed Record"));
                    failed++;
                    continue;
                }

                success++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Successful Records: " + success);
        System.out.println("Failed Records: " + failed);

        for (ParseError error : errors) {
            System.out.println(error);
        }
    }
}