package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Pretender {	
	
		@Embedded
		@JsonProperty
		public Tender tender;
		
		public Pretender() {}
		

		public Tender getTender() {
			return tender;
		}

		public void setTender(Tender tender) {
			this.tender = tender;
		}


		@Override
		public String toString() {
			return "Pretender [tender=" + tender + "]";
		}




		
		
}
