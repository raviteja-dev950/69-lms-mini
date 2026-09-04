package com.lms.controller;
import com.lms.entity.User; import com.lms.repository.UserRepository;
import com.lms.security.JwtUtil; import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestController @CrossOrigin(origins="*")
public class AuthController {
@Autowired private UserRepository userRepo; @Autowired private PasswordEncoder encoder; @Autowired private JwtUtil jwtUtil;
@PostMapping("/api/auth/register") public Map<String,String> register(@RequestBody Map<String,String> req){
if(userRepo.findByEmail(req.get("email")).isPresent()) throw new RuntimeException("Email exists");
User u=new User(); u.setName(req.get("name")); u.setEmail(req.get("email")); u.setPassword(encoder.encode(req.get("password"))); u.setRole(req.get("role"));
userRepo.save(u); String token=jwtUtil.generateToken(u.getEmail(),u.getRole());
return Map.of("token",token,"role",u.getRole(),"email",u.getEmail());
}
@PostMapping("/api/auth/login") public Map<String,String> login(@RequestBody Map<String,String> req){
User u=userRepo.findByEmail(req.get("email")).orElseThrow(()->new RuntimeException("User not found"));
if(!encoder.matches(req.get("password"),u.getPassword())) throw new RuntimeException("Invalid password");
String token=jwtUtil.generateToken(u.getEmail(),u.getRole());
return Map.of("token",token,"role",u.getRole(),"email",u.getEmail());
}}