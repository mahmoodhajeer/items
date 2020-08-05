package com.items.items.message.request;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.items.items.model.Category;
import com.items.items.model.Location;

public class ItemForm {
	
	@NotBlank
	@Size(min=3,max=50)
	private String itemName;
	
	@NotBlank
	@Size(min=3,max=200)
	private String itemDescription;
	
	private Location  locationId;
	
	private Set<Category> categoryId = new HashSet<>();

	 
	
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	

	
	
	public Set<Category> getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(Set<Category> categoryId){
        this.categoryId = categoryId;
    }
    
    public Location  getLocationId() {
        return this.locationId;
      }
      
      public void setLocationId(Location  locationId) {
        this.locationId = locationId;
      }
	
}


