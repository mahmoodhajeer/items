package com.items.items.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "city")
public class City {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long cityId;
	 
	 @NotBlank
	 @Size(min=3,max=50)
	 private String cityName;
	 
	 
	 public City(){}
	 
	 public City(long cityId,String cityName){
		 
		 this.cityId = cityId;
		 this.cityName=cityName;
	 }
	 
	 
	 public long getCityId() {
		 return cityId;
	 }
	 public void setCityId(long cityId) {
		 this.cityId = cityId;
	 }
	 
	 public String getCityName() {
		 return cityName;
	 }
	 public void setCityName(String cityName) {
		 this.cityName = cityName;
	 }
	 
	

}
