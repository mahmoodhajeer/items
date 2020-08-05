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
@Table(name = "contry")
public class Contry {


	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long contryId;
	 
	 
	 @NotBlank
	 @Size(min=3,max=50)
	 private String contryName;
	 
	 
	 public Contry(){}
	 
	 public Contry(long contryId,String contryName){
		 this.contryId = contryId;
		 this.contryName=contryName;
	 }
	 
	 
	 public long getContryId() {
		 return contryId;
	 }
	 public void setContryId(long contryId) {
		 this.contryId = contryId;
	 }
	 
	 public String getContryName() {
		 return contryName;
	 }
	 public void setContryName(String contryName) {
		 this.contryName = contryName;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
