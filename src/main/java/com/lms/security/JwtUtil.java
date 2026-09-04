package com.lms.security;
import org.springframework.stereotype.Component; import java.util.Base64;
@Component
public class JwtUtil {
public String generateToken(String email, String role){
String data = email+":"+role+":"+System.currentTimeMillis();
return Base64.getEncoder().encodeToString(data.getBytes());
}}