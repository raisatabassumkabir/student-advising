package bd.edu.seu.student.service;
import bd.edu.seu.student.model.Student;
import bd.edu.seu.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String sId) {
      Optional<Student>studentOptional= studentRepository.findBysId(sId);
        return studentOptional.orElse(null);
    }
}
