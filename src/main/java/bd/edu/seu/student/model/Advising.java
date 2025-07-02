package bd.edu.seu.student.model;

import org.springframework.data.annotation.Id;

public class Advising {

    @Id
    private String id;
    private Student student;
    private Course course;
    private String semester;
    private String grade;

    public Advising(Course course, String grade, String id, String semester, Student student) {
        this.course = course;
        this.grade = grade;
        this.id = id;
        this.semester = semester;
        this.student = student;
    }
     public Advising() {

     }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
