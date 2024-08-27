package com.terralogic.internProject.Authentication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthenticationRequest {

	 @Id
	 @Column(nullable = false , unique = true)
	 private String username;
	    private String password;
	    



	    public AuthenticationRequest() {}

	    public AuthenticationRequest(String username, String password , String email) {
	        this.username = username;
	        this.password = password;

	        
	    }



		public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	
	
	
	
	
}
