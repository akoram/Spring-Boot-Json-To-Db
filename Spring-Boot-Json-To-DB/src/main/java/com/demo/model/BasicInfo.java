package com.demo.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public class BasicInfo {
	
	@JsonProperty
	public String uniqueFileNo;
	@JsonProperty
	public int actualOrgid;
	@JsonProperty
	public String tRefNo;
	@JsonProperty
	public String tType;
	@JsonProperty
	public String tFormContract;
	@JsonProperty
	public String tNoOfCovers;
	@JsonProperty
	public String tTenderCategory;
	@JsonProperty
	public String tNoOfBidOpeners;
	@JsonProperty
	public boolean tAllowAutomaticEvaluation;
	@JsonProperty
	public boolean tAllowMultiCurrencyForBoq;
	@JsonProperty
	public String creatorName;
	@JsonProperty
	public String creatorReference;
	
	public BasicInfo() {}

	public String getUniqueFileNo() {
		return uniqueFileNo;
	}

	public void setUniqueFileNo(String uniqueFileNo) {
		this.uniqueFileNo = uniqueFileNo;
	}

	

	public int getActualOrgid() {
		return actualOrgid;
	}

	public void setActualOrgid(int actualOrgid) {
		this.actualOrgid = actualOrgid;
	}

	public String gettRefNo() {
		return tRefNo;
	}

	public void settRefNo(String tRefNo) {
		this.tRefNo = tRefNo;
	}

	public String gettType() {
		return tType;
	}

	public void settType(String tType) {
		this.tType = tType;
	}

	public String gettFormContract() {
		return tFormContract;
	}

	public void settFormContract(String tFormContract) {
		this.tFormContract = tFormContract;
	}

	public String gettNoOfCovers() {
		return tNoOfCovers;
	}

	public void settNoOfCovers(String tNoOfCovers) {
		this.tNoOfCovers = tNoOfCovers;
	}

	public String gettTenderCategory() {
		return tTenderCategory;
	}

	public void settTenderCategory(String tTenderCategory) {
		this.tTenderCategory = tTenderCategory;
	}

	public String gettNoOfBidOpeners() {
		return tNoOfBidOpeners;
	}

	public void settNoOfBidOpeners(String tNoOfBidOpeners) {
		this.tNoOfBidOpeners = tNoOfBidOpeners;
	}

	public boolean istAllowAutomaticEvaluation() {
		return tAllowAutomaticEvaluation;
	}

	public void settAllowAutomaticEvaluation(boolean tAllowAutomaticEvaluation) {
		this.tAllowAutomaticEvaluation = tAllowAutomaticEvaluation;
	}

	public boolean istAllowMultiCurrencyForBoq() {
		return tAllowMultiCurrencyForBoq;
	}

	public void settAllowMultiCurrencyForBoq(boolean tAllowMultiCurrencyForBoq) {
		this.tAllowMultiCurrencyForBoq = tAllowMultiCurrencyForBoq;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCreatorReference() {
		return creatorReference;
	}

	public void setCreatorReference(String creatorReference) {
		this.creatorReference = creatorReference;
	}
	
}
