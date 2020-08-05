package com.items.items.message.request;


import com.items.items.model.City;
import com.items.items.model.Contry;

public class LocationForm {
	
    private Contry contryId;
	
	private City cityId;
	
	
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
