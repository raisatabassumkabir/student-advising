package bd.edu.seu.student.model;


import org.springframework.data.annotation.Id;


public class Student {
    @Id
    private String id;
    private String sId;
    private String name;
    private String program;
    private String cgpa;

    public Student() {

    }

    public Student(String cgpa, String id, String name, String program, String sId) {
        this.cgpa = cgpa;
        this.id = id;
        this.name = name;
        this.program = program;
        this.sId = sId;
    }

    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
}
