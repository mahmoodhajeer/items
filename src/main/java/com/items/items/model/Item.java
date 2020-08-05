package com.items.items.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "items")
public class Item {

	
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	
	@NotBlank
	@Size(min=3,max=50)
	private String itemName;
	
	@NotBlank
	@Size(min=3,max=200)
	private String itemDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User userId;
	
	@OneToOne
	private Location locationId;
	
	 @ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "itemCategory", 
	    joinColumns = @JoinColumn(name = "itemId"), 
	    inverseJoinColumns = @JoinColumn(name = "categoryId"))
	 private Set<Category> categoryId = new HashSet<>();
	 
	
	 public Item() {}
	 
	 public Item(String itemName, String itemDescription){
         this.itemName = itemName;
	     this.itemDescription = itemDescription;
	 }
	 
	
	 

	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	
	
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
	
	
	
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	
	
	public Location getLocationId() {
		return locationId;
	}
	public void setLocationId(Location locationId) {
		this.locationId = locationId;
	}
	
	
	public Set<Category> getCategoryId(){
        return categoryId;
    }
    public void setCategoryId(Set<Category> categoryId){
        this.categoryId = categoryId;
    }
    
    
   
    
	
}
