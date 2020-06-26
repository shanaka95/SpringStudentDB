package vitaz.dev.studb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import vitaz.dev.studb.entity.Exams;
import vitaz.dev.studb.entity.Results;
import vitaz.dev.studb.entity.Student;
import vitaz.dev.studb.interfaces.ExamInterface;
import vitaz.dev.studb.interfaces.ResultInterface;
import vitaz.dev.studb.interfaces.StudentInterface;

import javax.xml.transform.Result;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentInterface stuInteface;

    @Autowired
    private ExamInterface exInterface;

    @Autowired
    private ResultInterface reInterface;

    public List<Student> getStudents(){
        return (List<Student>) stuInteface.findAll();
    }
    public Optional<Student> getStudent(String id){
        return stuInteface.findById(id);
    }


    public List<Exams> getExams(String id){

        return exInterface.findAllExams(id);
    }

    public List<Results> findUserExam(String id) {
        return reInterface.findUserExam(id);
    }
}
