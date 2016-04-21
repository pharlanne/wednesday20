package com.codeclan.md;


public abstract class User {
	protected String name;
	protected String lastname;
	protected String email;
	
	  public String printUserDetails(){
	   return lastname;
	  }
	  
	  public String getName(){
		  return name;
	  }
	  
	  public void setName(String name){
		  this.name = name;
	  }
	  public String getLastName(){
		  return lastname;
	  }
	  
	  public void setLastName(String lastname){
		  this.lastname = lastname;
	  }
	  
	  public String getEmail(){
		  return email;
	  }
	  
	  public void setEmail (String email){
	  		this.email = email;
	  }
 }
