package bd.edu.seu.student;


import bd.edu.seu.student.model.Course;
import bd.edu.seu.student.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseServiceTest {
    @Autowired
    private CourseService courseService;


    @Test
    public void addCourse(){
        Course course = new Course();

        course.setId("1");
        course.setCode("CSE101");
        course.setTitle("C");
        course.setCredit(4);
        courseService.addCourse(course);
    }
}
