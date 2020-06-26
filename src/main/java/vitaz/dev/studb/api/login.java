package vitaz.dev.studb.api;

import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
//import sun.security.provider.certpath.OCSPResponse;
import vitaz.dev.studb.entity.Student;
//import vitaz.dev.studb.entity.User;


@CrossOrigin
@RestController
public class login {
    @RequestMapping("/login")
    public HttpEntity<Student> login() {
        Student s=new Student();
        //Student user = (Student) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new ResponseEntity<>(s,HttpStatus.ACCEPTED);
    }

}
