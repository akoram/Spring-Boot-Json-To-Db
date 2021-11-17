package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Embeddable
@Entity
@Data
@Table(name="tenderWorkitem")
public class TenderWorkitem {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@JsonProperty
	@Embedded
	public Workitem workitem;
	@JsonProperty
	@Embedded
	public TenderFeeDetails tenderFeeDetails;
	@JsonProperty
	@Embedded
	public TenderCriticalDates tenderCriticalDates;
	
	public TenderWorkitem() {}

	public Workitem getWorkItem() {
		return workitem;
	}

	public void setWorkItem(Workitem workItem) {
		this.workitem = workItem;
	}

	public TenderFeeDetails getTenderFeeDetails() {
		return tenderFeeDetails;
	}

	public void setTenderFeeDetails(TenderFeeDetails tenderFeeDetails) {
		this.tenderFeeDetails = tenderFeeDetails;
	}

	public TenderCriticalDates getTenderCriticalDates() {
		return tenderCriticalDates;
	}

	public void setTenderCriticalDates(TenderCriticalDates tenderCriticalDates) {
		this.tenderCriticalDates = tenderCriticalDates;
	}
	
	
}
