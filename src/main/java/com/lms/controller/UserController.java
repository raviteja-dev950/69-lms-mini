package com.lms.controller;
import com.lms.entity.User; import com.lms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*;
@RestController @CrossOrigin(origins="*")
public class UserController {
@Autowired private UserRepository repo;
@GetMapping("/api/users/by-email")
public User byEmail(@RequestParam String email){ return repo.findByEmail(email).orElse(null); }
}