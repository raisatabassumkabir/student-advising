package bd.edu.seu.student.repository;

import bd.edu.seu.student.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
    Optional<Course>findByCode(String code);


}
