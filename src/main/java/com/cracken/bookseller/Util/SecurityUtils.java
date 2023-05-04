package com.cracken.bookseller.Util;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.StringUtils;

public class SecurityUtils {


    public static  final  String PREFIX_ROLE = "ROLE_";

    public static final   String AUTH_PREFIX = "authorization";

    public static final   String AUTH_TOKEN_TYPE = "Bearer" +
            "";
    public static final   String AUTH_TOKEN_PREFIX = AUTH_TOKEN_TYPE +   " ";

    public static SimpleGrantedAuthority convertToAuthority(String role){

        String formattedRole = role.startsWith(PREFIX_ROLE) ? role : PREFIX_ROLE + role;

        return  new SimpleGrantedAuthority(formattedRole);
    }


    public  static String extractTokenRequest(HttpServletRequest request){

        String bearerToken = request.getHeader(AUTH_PREFIX);
        if (StringUtils.hasLength(bearerToken) && bearerToken.startsWith(AUTH_TOKEN_TYPE)){
            return bearerToken.substring(7);
        }

        return null;
    }
}
