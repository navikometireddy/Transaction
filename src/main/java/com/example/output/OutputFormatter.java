package com.example.output;

import com.example.model.TransactionStatistics;

public class OutputFormatter {
    public static void printStats(TransactionStatistics transactionStatistics) {
        System.out.println(ConsoleMessages.SHOW_NUMBER_OF_TRANS_MESSAGE + transactionStatistics.getNumOfTransactions());
        System.out.println(ConsoleMessages.SHOW_AVG_TRANS_MESSAGE + transactionStatistics.getAvaerageVal());
    }
}
