package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Embeddable
@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="tenderBasicDetails")
public class TenderBasicDetails {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@Embedded
	@JsonProperty
	public BasicInfo basicInfo;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty
	public String multiCurrencyForBoq;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty
	public String boqinfo;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@Embedded
	@JsonProperty
	public CoverInfo coverinfo;

	public BasicInfo getBasicInfo() {
		System.out.println("basicInfo");
		return basicInfo;
	}

	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	
	public String getMultiCurrencyForBoq() {
		return multiCurrencyForBoq;
	}

	public void setMultiCurrencyForBoq(String multiCurrencyForBoq) {
		this.multiCurrencyForBoq = multiCurrencyForBoq;
	}

	

	public String getBoqinfo() {
		return boqinfo;
	}

	public void setBoqinfo(String boqinfo) {
		this.boqinfo = boqinfo;
	}

	public CoverInfo getCoverinfo() {
		return coverinfo;
	}

	public void setCoverinfo(CoverInfo coverinfo) {
		this.coverinfo = coverinfo;
	}

	
	
	

}
