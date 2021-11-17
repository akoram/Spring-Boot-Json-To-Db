package com.demo.model;

import java.util.Date;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class TenderCriticalDates {
	@JsonProperty
	public Date tPublishingDate;
	@JsonProperty
	public Date tDocDownloadStartDate;
	@JsonProperty
	public Date tSeekClarificationStartDate;
	@JsonProperty
	public Date tSeekClarificationEndDate;
	@JsonProperty
	public Date tBidsubStartDate;
	@JsonProperty
	public Date tBidsubEndDate;
	@JsonProperty
	public Date tBidOpenDate;
	
	public TenderCriticalDates() {}

	public Date gettPublishingDate() {
		return tPublishingDate;
	}

	public void settPublishingDate(Date tPublishingDate) {
		this.tPublishingDate = tPublishingDate;
	}

	public Date gettDocDownloadStartDate() {
		return tDocDownloadStartDate;
	}

	public void settDocDownloadStartDate(Date tDocDownloadStartDate) {
		this.tDocDownloadStartDate = tDocDownloadStartDate;
	}

	public Date gettSeekClarificationStartDate() {
		return tSeekClarificationStartDate;
	}

	public void settSeekClarificationStartDate(Date tSeekClarificationStartDate) {
		this.tSeekClarificationStartDate = tSeekClarificationStartDate;
	}

	public Date gettSeekClaficationEndDate() {
		return tSeekClarificationStartDate;
	}

	public void settSeekClaficationEndDate(Date tSeekClaficationEndDate) {
		this.tSeekClarificationStartDate = tSeekClaficationEndDate;
	}

	public Date gettBidSubStartDate() {
		return tBidsubStartDate;
	}

	public void settBidSubStartDate(Date tBidSubStartDate) {
		this.tBidsubStartDate = tBidSubStartDate;
	}

	public Date gettBidSubEndDate() {
		return tBidsubEndDate;
	}

	public void settBidSubEndDate(Date tBidSubEndDate) {
		this.tBidsubEndDate = tBidSubEndDate;
	}

	public Date gettBidOpenDate() {
		return tBidOpenDate;
	}

	public void settBidOpenDate(Date tBidOpenDate) {
		this.tBidOpenDate = tBidOpenDate;
	}
	

}
