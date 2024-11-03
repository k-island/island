package raisetech.Student.Management.controller.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentsCourse;
import raisetech.Student.Management.domain.StudentDetail;

@Component
public class StudentConverter {

  public List<StudentDetail> convertStudentDetails(List<Student> students,
      List<StudentsCourse> studentsCourses) {
    List<StudentDetail> studentDetails = new ArrayList<>();
    for (Student student : students) {
      StudentDetail studentDetail = new StudentDetail();
      studentDetail.setStudent(student);

      List<StudentsCourse> convertStudentsCours = studentsCourses.stream()
          .filter(studentsCourses1 -> student.getId().equals(studentsCourses1.getStudentsId()))
          .collect(Collectors.toList());
      studentDetail.setStudentsCours(convertStudentsCours);
      studentDetails.add(studentDetail);
    }
    // 修正：空のリストではなく、実際に生成した studentDetails を返す
    return studentDetails;
  }
}
