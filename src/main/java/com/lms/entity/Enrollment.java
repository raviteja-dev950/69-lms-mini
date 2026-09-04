package com.lms.entity;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity
public class Enrollment {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
@ManyToOne private User user;
@ManyToOne private Course course;
private LocalDate enrolledAt = LocalDate.now();
private String status = "ENROLLED";
private Integer progress = 15;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public User getUser(){return user;} public void setUser(User u){this.user=u;}
public Course getCourse(){return course;} public void setCourse(Course c){this.course=c;}
public LocalDate getEnrolledAt(){return enrolledAt;} public void setEnrolledAt(LocalDate d){this.enrolledAt=d;}
public String getStatus(){return status;} public void setStatus(String s){this.status=s;}
public Integer getProgress(){return progress;} public void setProgress(Integer p){this.progress=p;}
}