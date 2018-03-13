package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMiltiple;

	public ExchangeValue() {

	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMiltiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMiltiple = conversionMiltiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMiltiple() {
		return conversionMiltiple;
	}

	public void setConversionMiltiple(BigDecimal conversionMiltiple) {
		this.conversionMiltiple = conversionMiltiple;
	}

}
