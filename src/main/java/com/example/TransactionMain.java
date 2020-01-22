package com.example;

import java.io.IOException;
import java.util.List;
import com.example.exceptions.ArgumentsNotPassedException;
import com.example.exceptions.BlankDateException;
import com.example.exceptions.DateInvalidFormatException;
import com.example.exceptions.ExtensionDoesNotExist;
import com.example.exceptions.FileDoesNotExistException;
import com.example.exceptions.FileNotAllowedException;
import com.example.input.CSVReader;
import com.example.input.InputReader;
import com.example.exceptions.ExceptionMessages;
import com.example.model.FilterParam;
import com.example.output.OutputFormatter;
import com.example.transaction.processor.TransactionProcessor;
import com.example.model.TransactionStatistics;

public class TransactionMain {

	public static void main(String[] args) throws IOException, FileDoesNotExistException, ExtensionDoesNotExist,
			FileNotAllowedException, ArgumentsNotPassedException, BlankDateException, DateInvalidFormatException {

		if (args.length < 1) {
			throw new ArgumentsNotPassedException(ExceptionMessages.CSV_FILES_MISSING);
		}

		FilterParam filterParam = InputReader.readFilterParamsFromUser();
		List<String> unformattedTransactions = CSVReader.readCSVs(args);

		TransactionProcessor transactionProcessor = new TransactionProcessor();
		TransactionStatistics transactionStatistics = transactionProcessor.getStatistics(unformattedTransactions, filterParam);
		OutputFormatter.printStats(transactionStatistics);
	}
}
