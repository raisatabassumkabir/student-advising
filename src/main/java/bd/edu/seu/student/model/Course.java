package bd.edu.seu.student.model;

import org.springframework.data.annotation.Id;

public class Course {

    @Id
   private  String id;
   private  String code;
   private  String title;
   private int credit;

    public Course(String code, int credit, String id, String title) {
        this.code = code;
        this.credit = credit;
        this.id = id;
        this.title = title;
    }
     public Course() {

}
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
