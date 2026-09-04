package com.lms.controller;
import com.lms.entity.Enrollment; import com.lms.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @CrossOrigin(origins="*")
public class EnrollmentController {
@Autowired private EnrollmentRepository repo;
@PostMapping("/api/enrollments")
public Enrollment enroll(@RequestBody Enrollment e){ e.setStatus("ENROLLED"); e.setProgress(15); return repo.save(e); }
@GetMapping("/api/enrollments")
public List<Enrollment> all(){ return repo.findAll(); }
@GetMapping("/api/enrollments/my/{email}")
public List<Enrollment> my(@PathVariable String email){ return repo.findByUser_Email(email); }
}