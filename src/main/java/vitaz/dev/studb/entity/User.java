package vitaz.dev.studb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String Username;
    private String Password;
    private Boolean Enabled;
    private String Id;

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }



    public User() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
