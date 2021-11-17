package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Tender {
	
	@Embedded
	@JsonProperty
	public TenderBasicDetails tenderBasicDetails;
	@Embedded
	@JsonProperty
	public TenderWorkitem tenderWorkitem;
	
	public Tender() {}

	
	public TenderBasicDetails getTenderBasicDetails() {
		return tenderBasicDetails;
	}


	public void setTenderBasicDetails(TenderBasicDetails tenderBasicDetails) {
		this.tenderBasicDetails = tenderBasicDetails;
	}


	public TenderWorkitem getTenderWorkitem() {
		return tenderWorkitem;
	}

	public void setTenderWorkitem(TenderWorkitem tenderWorkitem) {
		this.tenderWorkitem = tenderWorkitem;
	}
	
	

}
