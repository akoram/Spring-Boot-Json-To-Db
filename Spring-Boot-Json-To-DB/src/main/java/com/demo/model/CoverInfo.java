package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
@Embeddable
public class CoverInfo {
	@JsonIgnoreProperties(ignoreUnknown = true)
	@Embedded
	@JsonProperty
	public List<Cover> cover = new ArrayList<>();;
	
	public CoverInfo() {}

}