package vitaz.dev.studb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "userexams3")
@Table(name = "subjects")
public class Subjects {
    @Id
    private String id;
    private String name;
    private String credit;

    public Subjects(String id, String name, String credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public Subjects() {
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

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
