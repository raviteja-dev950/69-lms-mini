package com.lms.config;
import com.lms.entity.Course; import com.lms.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.boot.CommandLineRunner; import org.springframework.stereotype.Component;
@Component
public class DataLoader implements CommandLineRunner {
@Autowired private CourseRepository repo;
@Override public void run(String... args) throws Exception {
if(repo.count()==0){
Course c1=new Course(); c1.setTitle("Java Full Stack Mastery"); c1.setDescription("Spring Boot + React + Microservices complete course"); c1.setInstructor("Ravi Teja"); c1.setCategory("Java"); c1.setPrice(2999.0); c1.setDuration("40 Hours"); c1.setLevel("Advanced"); c1.setImageUrl("https://images.unsplash.com/photo-1515879218367-8466d910aaa4"); repo.save(c1);
Course c2=new Course(); c2.setTitle("React 18 + Tailwind Pro"); c2.setDescription("Modern frontend with hooks and premium UI"); c2.setInstructor("Ravi Teja"); c2.setCategory("Frontend"); c2.setPrice(1999.0); c2.setDuration("25 Hours"); c2.setLevel("Beginner"); c2.setImageUrl("https://images.unsplash.com/photo-1633356122544-f134324a6cee"); repo.save(c2);
Course c3=new Course(); c3.setTitle("AWS DevOps + Docker"); c3.setDescription("Deploy Spring Boot apps to AWS with CI/CD"); c3.setInstructor("Ravi Teja"); c3.setCategory("DevOps"); c3.setPrice(3999.0); c3.setDuration("30 Hours"); c3.setLevel("Intermediate"); c3.setImageUrl("https://images.unsplash.com/photo-1451187580459-43490279c0fa"); repo.save(c3);
System.out.println("Sample courses added!");
}}}