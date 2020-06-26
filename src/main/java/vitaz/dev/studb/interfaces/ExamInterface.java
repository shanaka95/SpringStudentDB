package vitaz.dev.studb.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vitaz.dev.studb.entity.Exams;
import java.util.List;

public interface ExamInterface extends CrudRepository<Exams,String> {

    @Query(value = "SELECT DISTINCT new vitaz.dev.studb.entity.Exams(name,userid,examid) FROM userexams where userid=:id")
    List<Exams> findAllExams(String id);


}