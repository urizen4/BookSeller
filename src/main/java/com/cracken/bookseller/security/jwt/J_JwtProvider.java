package com.cracken.bookseller.security.jwt;

import com.cracken.bookseller.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface J_JwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    Boolean  validateToken(HttpServletRequest request);
}
