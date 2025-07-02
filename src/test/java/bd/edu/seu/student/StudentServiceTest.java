package bd.edu.seu.student;

import bd.edu.seu.student.model.Student;
import bd.edu.seu.student.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void saveStudent() {
        Student student1 = new Student();
        student1.setsId("101");
        student1.setName("test1");
        student1.setProgram("CSE");
        student1.setCgpa("3.9");
        studentService.addStudent(student1);

    }

}
