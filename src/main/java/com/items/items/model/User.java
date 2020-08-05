package com.items.items.model;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Table(name = "users", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"userName"}),
		@UniqueConstraint(columnNames = {"email"})
})

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@NotBlank
    @Size(min=3,max=50)
    private String name;

    @NotBlank
    @Size(min=3, max = 50)
    private String userName;
 
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
 
    @NotBlank
    @Size(min=6, max = 100)
    private String password;
    
    

    
 
    public User(){}

    public User(long id,String name, String userName, String email,String password){
    	this.userId= id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
    public User(String name, String userName, String email,String password){
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }



    public long getId(){
        return userId;
    }
    public void setId(long userId){
        this.userId = userId;
    }


    public String getUserName(){
        return userName;
    }
    public void setUername(String userName){
        this.userName = userName;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


 
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
   

}
























