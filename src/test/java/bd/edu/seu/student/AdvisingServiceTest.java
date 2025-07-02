package bd.edu.seu.student;


import bd.edu.seu.student.model.Advising;
import bd.edu.seu.student.model.Course;
import bd.edu.seu.student.model.Student;
import bd.edu.seu.student.service.AdvisingService;
import bd.edu.seu.student.service.CourseService;
import bd.edu.seu.student.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdvisingServiceTest {

    @Autowired
    private AdvisingService advisingService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Test
    public void AdvisingServiceTest(){

        Student student= studentService.getStudentById("101");
        System.out.println("name:" + student.getName());

        Course course =courseService.getCourseByCode("CSE101");
        System.out.println("title :" + course.getTitle());


         Advising advising = new Advising();
        advising.setStudent(student);
        advising.setCourse(course);
        advising.setSemester("Spring 2025");
        advisingService.saveAdvising(advising);
    }



}
