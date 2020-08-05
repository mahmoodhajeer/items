package com.items.items.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "location")
public class Location {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long locationId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Contry contryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private City cityId;
	
	
	public Location(){}

	 public Location(City cityId, Contry contryId ){
	     this.contryId = contryId;
	     this.cityId = cityId;
	   }
	 
	 
	 
	 public long getLocationId() {
	     return locationId;
	 }
	 public void setLocationId(long locationId) {
		 this.locationId = locationId;
	 }
	 
		 
	 
	public City getCityId() {
		return cityId;
	}
	public void setCityId(City cityId) {
		this.cityId = cityId;
	}
		
		
		
	public Contry getContryId() {
		return contryId;
	}
	public void setContryId(Contry contryId) {
		this.contryId = contryId;
	}
	
	
	
	
	
	
	
	
	
	 

	 

}
