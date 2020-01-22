package com.example.transaction;

import com.example.model.FilterParam;
import com.example.model.TransactionStatistics;

public interface Analyzer {

	TransactionStatistics getStatistics(FilterParam filterParam);
	
}
