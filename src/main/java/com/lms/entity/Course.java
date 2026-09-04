package com.lms.entity;
import jakarta.persistence.*;
@Entity
public class Course {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
private String title; @Column(length=1000) private String description; private String instructor;
private String category; private Double price; private String duration;
private String imageUrl; private String level;
public Long getId(){return id;} public void setId(Long id){this.id=id;}
public String getTitle(){return title;} public void setTitle(String t){this.title=t;}
public String getDescription(){return description;} public void setDescription(String d){this.description=d;}
public String getInstructor(){return instructor;} public void setInstructor(String i){this.instructor=i;}
public String getCategory(){return category;} public void setCategory(String c){this.category=c;}
public Double getPrice(){return price;} public void setPrice(Double p){this.price=p;}
public String getDuration(){return duration;} public void setDuration(String d){this.duration=d;}
public String getImageUrl(){return imageUrl;} public void setImageUrl(String u){this.imageUrl=u;}
public String getLevel(){return level;} public void setLevel(String l){this.level=l;}
}