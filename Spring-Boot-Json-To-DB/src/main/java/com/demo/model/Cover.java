package com.demo.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Embeddable
public class Cover {
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty
	public Integer tCoverNo;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty
	public String tDocDesc;
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty
	public String tDocType;
	
	public Cover() {}

	public int gettCoverNo() {
		System.out.println("tCoverNo:"+tCoverNo);
		return tCoverNo;
	}

	public void settCoverNo(int tCoverNo) {
		this.tCoverNo = tCoverNo;
	}

	public String gettDocDesc() {
		System.out.println("tDocDesc:"+tDocDesc);
		return tDocDesc;
	}

	public void settDocDesc(String tDocDesc) {
		this.tDocDesc = tDocDesc;
	}

	public String gettDocType() {
		System.out.println("tDocType:"+tDocType);
		return tDocType;
	}

	public void settDocType(String tDocType) {
		this.tDocType = tDocType;
	}

	@Override
	public String toString() {
		return "Cover [tCoverNo=" + tCoverNo + ", tDocDesc=" + tDocDesc + ", tDocType=" + tDocType + "]";
	}
	
	
	

}
