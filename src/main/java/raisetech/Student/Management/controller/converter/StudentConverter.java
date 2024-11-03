package raisetech.Student.Management.controller.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentCourse;
import raisetech.Student.Management.domain.StudentDetail;

@Component
public class StudentConverter {

  public List<StudentDetail> convertStudentDetails(List<Student> students,
      List<StudentCourse> studentsCourses) {
    List<StudentDetail> studentDetails = new ArrayList<>();
    for (Student student : students) {
      StudentDetail studentDetail = new StudentDetail();
      studentDetail.setStudent(student);

      List<StudentCourse> convertStudentCourses = studentsCourses.stream()
          .filter(studentsCourses1 -> student.getId().equals(studentsCourses1.getStudentsId()))
          .collect(Collectors.toList());
      studentDetail.setStudentsCours(convertStudentCourses);
      studentDetails.add(studentDetail);
    }
    return new ArrayList<>();
  }

}

