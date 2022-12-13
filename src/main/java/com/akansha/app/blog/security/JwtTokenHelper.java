package com.akansha.app.blog.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenHelper {
	
	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	private String secret = "jwtTokenKey";
	
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims:: getSubject);
	}
	
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims:: getExpiration);
	}
	
	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}

	private Claims getAllClaimsFromToken(String token) {
		// TODO Auto-generated method stub
		return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
	}
	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	public String generateToken(UserDetails userDetails) {
		Map<String,Object> claims = new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
		
	}
	// while creating the token
	// Define cliams of the token, like Issuer, Expiration, Subject, and the ID
	// Sign the JWT using the HS512 algorithm and the secret key.
	/**
	 * Method to create the token
	 * 
	 * @param claims
	 * @param subject
	 * @return This returns the generated token
	 */
	private String doGenerateToken(Map<String, Object> claims, String subject) {
		
		return Jwts.builder().setClaims(claims).setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
				.signWith(SignatureAlgorithm.HS512, secret).compact();
	}
	//1000 * 60 * 30
	/**
	 * Method to validate the token
	 * 
	 * @param token
	 * @param userDetails
	 * @return This returns true if the token is valid else returns false
	 */
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String username = getUsernameFromToken(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
}
