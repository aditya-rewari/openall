package com.eminenceinnovation.openall.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/openall/v1")
public class MyController {

    private static final String SECRET_KEY = "your-secret-key";

    @GetMapping("/parseToken")
    public Claims parseToken(String jwtToken) {
        // Parse the JWT token and return the claims
        return Jwts.parser()
                .setSigningKey(SECRET_KEY) // Set the signing key
                .parseClaimsJws(jwtToken) // Parse the JWT token
                .getBody(); // Return the claims
    }
}
