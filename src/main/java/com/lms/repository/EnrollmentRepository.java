package com.lms.repository;
import com.lms.entity.Enrollment; import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
List<Enrollment> findByUser_Email(String email);
}