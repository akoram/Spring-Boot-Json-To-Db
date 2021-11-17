package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name="pretenderFile")
public class PretenderFile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	
	@Embedded
	@JsonProperty
	public Pretender pretender;
	
	public PretenderFile() {}

	
}
