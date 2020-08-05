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
@Table(name = "Category")
public class Category {	
	

	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long categoryId;
	 
	    @NotBlank
	    @Size(min=3,max=50)
	    private String categoryName;
	 
	    public Category() {}
	 
	    public Category(String categoryName) {
	        this.categoryName = categoryName;
	    }


	 
	    public Long getCategoryId() {
	        return categoryId;
	    }
	    public void setCategoryId(Long categoryId) {
	        this.categoryId = categoryId;
	    }


	 
	    public String getCategoryName() {
	        return categoryName;
	    }
	    public void setCategoryName(String categoryName) {
	        this.categoryName = categoryName;
	    }
	    
	    

}
