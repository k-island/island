package raisetech.Student.Management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentsCourses;
import raisetech.Student.Management.repository.StudentRepository;

@SpringBootApplication

public class StudentManagementApplication {


  public static void main(String[] args) {
    SpringApplication.run(StudentManagementApplication.class, args);
  }
}
