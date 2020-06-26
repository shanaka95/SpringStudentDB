package vitaz.dev.studb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vitaz.dev.studb.entity.Exams;
import vitaz.dev.studb.entity.Results;
import vitaz.dev.studb.entity.Student;
import vitaz.dev.studb.services.StudentService;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentDetails {

    @Autowired
    private StudentService stuService;


    @RequestMapping("/students")
    public List<Student> getUsers(){
        return stuService.getStudents();
    }

    @RequestMapping("/student/{id}")
    public Optional<Student> getUser(@PathVariable String id){
        return stuService.getStudent(id);
    }

    @RequestMapping("/profile")
    public Optional<Student> getProfile(Authentication authentication, Principal principal){

        return stuService.getStudent(authentication.getName());
    }

    @RequestMapping("/exams")
    public List<Exams> getExams(Authentication authentication, Principal principal){

        return stuService.getExams(authentication.getName());
    }

    @RequestMapping("/results")
    public List<Results> getResult(Authentication authentication, Principal principal){

        return stuService.findUserExam(authentication.getName());
//        return new Results("a", "a", "a", "a", "a", "a", "a", "a");
    }
}
