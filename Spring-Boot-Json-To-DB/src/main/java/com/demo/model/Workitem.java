package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Workitem {
	@JsonProperty
	public String tWorkitemTitle;
	@JsonProperty
	public String tWorkitemDesc;
	@JsonProperty
	public String tWorkitemPreQual;
	@JsonProperty
	public String tWorkitemProdCat;
	@JsonProperty
	public String tWorkitemProdSubCat;
	@JsonProperty
	public String tWorkitemContractType;
	@JsonProperty
	public long tWorkitemTenderValue;
	@JsonProperty
	public double tBidValidityDays;
	@JsonProperty
	public double tDeliveryPeriodDays;
	@JsonProperty
	public boolean tAllowGteDetails;
	@JsonProperty
	public String tTemplateName;
	@JsonProperty
	public String tIndExtMonitor;
	@JsonProperty
	public String tLocationDetails;
	@JsonProperty
	public long tPincode;
	@JsonProperty
	public boolean tPreBidMeeting;
	@JsonProperty
	public String tPreBidMeetingPlace;
	@JsonProperty
	public String tPreBidMeetingAddress;
	@JsonProperty
	public String tBidOpenningPlace;
	@JsonProperty
	public String tTendererClass;
	@JsonProperty
	public String tInvitingOfficer;
	@JsonProperty
	public String tInvitingOffAddress;
	@JsonProperty
	public boolean tAllowItemwiseEvaluation;

	public Workitem() {
	}

	public String gettWorkitemTitle() {
		return tWorkitemTitle;
	}

	public void settWorkitemTitle(String tWorkitemTitle) {
		this.tWorkitemTitle = tWorkitemTitle;
	}

	public String gettWorkitemDesc() {
		return tWorkitemDesc;
	}

	public void settWorkitemDesc(String tWorkitemDesc) {
		this.tWorkitemDesc = tWorkitemDesc;
	}

	public String gettWorkitemPreQual() {
		return tWorkitemPreQual;
	}

	public void settWorkitemPreQual(String tWorkitemPreQual) {
		this.tWorkitemPreQual = tWorkitemPreQual;
	}

	public String gettWorkitemProdCat() {
		return tWorkitemProdCat;
	}

	public void settWorkitemProdCat(String tWorkitemProdCat) {
		this.tWorkitemProdCat = tWorkitemProdCat;
	}

	public String gettWorkitemProdSubCat() {
		return tWorkitemProdSubCat;
	}

	public void settWorkitemProdSubCat(String tWorkitemProdSubCat) {
		this.tWorkitemProdSubCat = tWorkitemProdSubCat;
	}

	public String gettWorkitemContractType() {
		return tWorkitemContractType;
	}

	public void settWorkitemContractType(String tWorkitemContractType) {
		this.tWorkitemContractType = tWorkitemContractType;
	}

	public long gettWorkitemTenderValue() {
		return tWorkitemTenderValue;
	}

	public void settWorkitemTenderValue(long tWorkitemTenderValue) {
		this.tWorkitemTenderValue = tWorkitemTenderValue;
	}

	public double gettBidValidityDays() {
		return tBidValidityDays;
	}

	public void settBidValidityDays(double tBidValidityDays) {
		this.tBidValidityDays = tBidValidityDays;
	}

	public boolean istAllowGteDetails() {
		return tAllowGteDetails;
	}

	public void settAllowGteDetails(boolean tAllowGteDetails) {
		this.tAllowGteDetails = tAllowGteDetails;
	}

	public String gettTemplateName() {
		return tTemplateName;
	}

	public void settTemplateName(String tTemplateName) {
		this.tTemplateName = tTemplateName;
	}

	public String gettIndExtMonitor() {
		return tIndExtMonitor;
	}

	public void settIndExtMonitor(String tIndExtMonitor) {
		this.tIndExtMonitor = tIndExtMonitor;
	}

	public String gettLocationDetails() {
		return tLocationDetails;
	}

	public void settLocationDetails(String tLocationDetails) {
		this.tLocationDetails = tLocationDetails;
	}

	public long gettPincode() {
		return tPincode;
	}

	public void settPincode(long tPincode) {
		this.tPincode = tPincode;
	}

	public boolean istPreBidMeeting() {
		return tPreBidMeeting;
	}

	public void settPreBidMeeting(boolean tPreBidMeeting) {
		this.tPreBidMeeting = tPreBidMeeting;
	}

	public String gettPreBidMeetingPlace() {
		return tPreBidMeetingPlace;
	}

	public void settPreBidMeetingPlace(String tPreBidMeetingPlace) {
		this.tPreBidMeetingPlace = tPreBidMeetingPlace;
	}

	public String gettPreBidMeetingAddress() {
		return tPreBidMeetingAddress;
	}

	public void settPreBidMeetingAddress(String tPreBidMeetingAddress) {
		this.tPreBidMeetingAddress = tPreBidMeetingAddress;
	}

	public String gettBidOpenningPlace() {
		return tBidOpenningPlace;
	}

	public void settBidOpenningPlace(String tBidOpenningPlace) {
		this.tBidOpenningPlace = tBidOpenningPlace;
	}

	public String gettTendererClass() {
		return tTendererClass;
	}

	public void settTendererClass(String tTendererClass) {
		this.tTendererClass = tTendererClass;
	}

	public String gettInvitingOfficer() {
		return tInvitingOfficer;
	}

	public void settInvitingOfficer(String tInvitingOfficer) {
		this.tInvitingOfficer = tInvitingOfficer;
	}

	public String gettInvitingOffAddress() {
		return tInvitingOffAddress;
	}

	public void settInvitingOffAddress(String tInvitingOffAddress) {
		this.tInvitingOffAddress = tInvitingOffAddress;
	}

	public boolean istAllowItemwiseEvaluation() {
		return tAllowItemwiseEvaluation;
	}

	public void settAllowItemwiseEvaluation(boolean tAllowItemwiseEvaluation) {
		this.tAllowItemwiseEvaluation = tAllowItemwiseEvaluation;
	}

}
