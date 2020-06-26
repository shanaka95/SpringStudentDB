package vitaz.dev.studb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userexams")
public class Exams {


    private String userid;
    @Id
//    private String subid;
    private String name;
    private String examid;

    public Exams(String name,String userid, String examid) {
        this.userid = userid;
        this.name = name;
        this.examid = examid;
    }

    public Exams() {

    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

//    public String getSubid() {
//        return subid;
//    }
//
//    public void setSubid(String subid) {
//        this.subid = subid;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
