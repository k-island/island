package raisetech.Student.Management.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import raisetech.Student.Management.data.Student;
import raisetech.Student.Management.data.StudentCourse;

@Getter
@Setter
public class StudentDetail {

 private Student student;
 private List<StudentCourse> studentsCours;

}
