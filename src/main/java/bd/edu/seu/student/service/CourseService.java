package bd.edu.seu.student.service;


import bd.edu.seu.student.model.Course;
import bd.edu.seu.student.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourseByCode(String code){
        Optional<Course> optionalCourse =courseRepository.findByCode(code);
        return optionalCourse.orElse(null);
    }
}
