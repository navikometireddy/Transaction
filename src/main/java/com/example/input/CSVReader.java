package com.example.input;

import com.example.exceptions.ExtensionDoesNotExist;
import com.example.exceptions.FileDoesNotExistException;
import com.example.exceptions.FileNotAllowedException;
import com.example.input.processor.CSVProcessor;
import com.example.input.processor.FileProcessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<String> readCSVs(String[] args) throws ExtensionDoesNotExist, FileNotAllowedException, FileDoesNotExistException, IOException {
        List<String> transactions = new ArrayList<>();
        FileProcessor csvProcessor = new CSVProcessor();

        for (int i = 0; i < args.length; i++) {
            transactions.addAll(csvProcessor.process(args[i]));
        }

        return transactions;
    }
}
