package com.terralogic.internProject.SecuritySetup;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Collectors;




	
	
	@RestController
	public class JwtGenerator {
		
		
		@GetMapping("webapplication/getcsrftoken")
		public String getCsrfToken(HttpServletRequest request)
		{
			
			
			return request.getAttribute("_csrf").toString();
			
			
		}
		

	     public  String AuthenticatorDetails(Authentication auth)
	     {
			
			
			 String jwt = new  JwtResponse(CreateString(auth)).toString();
			 
			return jwt ;
			
	     }
		
		

		@Autowired
		JwtEncoder jwtEncoder ; 
		


		
		
		public String CreateString( Authentication auth)
		{
			var claim = JwtClaimsSet.builder().issuedAt(Instant.now()).issuer(auth.getName()).expiresAt(Instant.now().plus(Duration.ofMinutes(30)))
					
					
					.claim("roles", CreateClaims(auth)).build() ;
			
			
			JwtEncoderParameters parameters = JwtEncoderParameters.from(claim) ;
			
		return	jwtEncoder.encode(parameters).getTokenValue();
			
			
		}
		
		
		
		
		
		
		
		
		private String CreateClaims(Authentication auth) {
			
			return auth.getAuthorities().stream().map(a ->a.getAuthority()).collect(Collectors.joining(" ")) ;
			
		}
		
		

		
		




		record JwtResponse( String str) {

			public String str() {
				return str;
			}
			
			
		} ; 

}
	

