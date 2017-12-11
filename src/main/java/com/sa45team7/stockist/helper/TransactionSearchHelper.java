package com.sa45team7.stockist.helper;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TransactionSearchHelper {
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private Date startDate;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private Date endDate;
	
	public TransactionSearchHelper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
