package com.project.boardback.provider;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtProvider {
  
  private String secretKey = "S3cr3tK3y";

  public String create(String email) {

    Date expiredDate = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));

    String jwt = Jwts.builder()
        .signWith(SignatureAlgorithm.ES256, secretKey)
        .setSubject(email).setIssuedAt(new Date()).setExpiration(expiredDate)
        .compact();
    
    return jwt;

  }

  public String validate(String jwt) {

    Claims claimns = null;

    try {
      claimns = Jwts.parser().setSigningKey(secretKey)
        .parseClaimsJws(jwt).getBody();
    } catch (Exception exception) {
        exception.printStackTrace();
        return null;
    }

    return claimns.getSubject();

  }
}
