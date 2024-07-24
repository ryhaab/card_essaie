package com.example.cardservice.security;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private static final String SECRET_KEY = "ELaWr6RYApHJ11y4rr0Afj5Wbw3YDYbdB7/EWyF/IV8="; // Remplacez par votre clé secrète
    private static final long EXPIRATION_TIME = 365 * 24 * 60 * 60 * 1000L; // 1 an en millisecondes

    public String generateToken(String username) {
        Date now = new Date();
        Date expirationDate = new Date(now.getTime() + EXPIRATION_TIME);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
