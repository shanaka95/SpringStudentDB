package vitaz.dev.studb.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sql.DataSource;

@Entity(name = "userexams2")
@Table(name = "userexams")
public class Results {


    String userid;
    String examid;
    @Id
    String subid;
    String date;
    String result;

    String name;
    String ca;
    String ese;

    String subname;
    String credits;

    public Results() {
    }

    public Results(String userid, String examid, String subid, String date, String result, String name, String ca, String ese, String subname, String credits) {
        this.userid = userid;
        this.examid = examid;
        this.subid = subid;
        this.date = date;
        this.result = result;
        this.name = name;
        this.ca = ca;
        this.ese = ese;
        this.subname = subname;
        this.credits = credits;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getEse() {
        return ese;
    }

    public void setEse(String ese) {
        this.ese = ese;
    }
}
