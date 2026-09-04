package com.lms.controller;
import com.lms.entity.Course; 
import com.lms.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController 
@CrossOrigin(origins="*")
public class CourseController {
@Autowired private CourseRepository repo;
@GetMapping("/api/courses")
public List<Course> all(){ return repo.findAll(); }
@PostMapping("/api/courses")
public Course add(@RequestBody Course c){ return repo.save(c); }
@DeleteMapping("/api/courses/{id}")
public void del(@PathVariable Long id){ repo.deleteById(id); }
}