package com.demo.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class TenderFeeDetails {

	@JsonProperty
	public int tFee;
	@JsonProperty
	public int tEmdFee;
	@JsonProperty
	public boolean tAllowMultiCurrencyForFee;
	@JsonProperty
	public String multiCurrencyForFee;

	public TenderFeeDetails() {
	}

	public int gettFee() {
		return tFee;
	}

	public void settFee(int tFee) {
		this.tFee = tFee;
	}

	public int gettEmdFee() {
		return tEmdFee;
	}

	public void settEmdFee(int tEmdFee) {
		this.tEmdFee = tEmdFee;
	}

	public boolean istAllowMultiCurrencyForFee() {
		return tAllowMultiCurrencyForFee;
	}

	public void settAllowMultiCurrencyForFee(boolean tAllowMultiCurrencyForFee) {
		this.tAllowMultiCurrencyForFee = tAllowMultiCurrencyForFee;
	}

	public String getMultiCurrencyForFee() {
		return multiCurrencyForFee;
	}

	public void setMultiCurrencyForFee(String multiCurrencyForFee) {
		this.multiCurrencyForFee = multiCurrencyForFee;
	}

}
