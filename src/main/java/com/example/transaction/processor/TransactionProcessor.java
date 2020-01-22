package com.example.transaction.processor;

import java.util.List;

import com.example.transaction.TransactionAnalyzer;
import com.example.transaction.formatter.TransactionDataFormatter;
import com.example.model.FilterParam;
import com.example.model.Transaction;
import com.example.transaction.Analyzer;
import com.example.model.TransactionStatistics;

public class TransactionProcessor {

	public TransactionStatistics getStatistics(List<String> unformattedTransactions, FilterParam filterParam) {

		List<Transaction> formattedTransactions  = TransactionDataFormatter.getFormattedTransactions(unformattedTransactions);

		Analyzer analyzer = new TransactionAnalyzer(formattedTransactions);
		return analyzer.getStatistics(filterParam);
	}

}
