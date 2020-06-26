package vitaz.dev.studb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vitaz.dev.studb.entity.User;
import vitaz.dev.studb.interfaces.userInterface;

@Controller
public class RegisterStudent {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private userInterface userRepository;

    @RequestMapping("/register")
    public User doRegister() {
        String encodedPassword  = passwordEncoder.encode("shanaka1");

        User user = new User();
        user.setEnabled(Boolean.TRUE);
        user.setPassword(encodedPassword);
        user.setUsername("shanaka1");
        user.setId("12346");
        user.setUsername("shanaka951");
//        UserAuthority boardAuthority = new UserAuthority();
//        boardAuthority.setAuthority("BOARD");
//        boardAuthority.setUser(user);
//        user.getAuthorities().add(boardAuthority);
        userRepository.save(user);

        return user;
    }
}
