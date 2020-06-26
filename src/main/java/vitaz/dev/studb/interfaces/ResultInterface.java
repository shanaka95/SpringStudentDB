package vitaz.dev.studb.interfaces;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vitaz.dev.studb.entity.Results;

import java.util.List;

public interface ResultInterface extends CrudRepository<Results,String> {

    @Query(value = "SELECT new vitaz.dev.studb.entity.Results(e.userid,e.examid,e.subid,e.date,e.result,e.name,e.ca,e.ese,f.name,f.credit) FROM userexams2 e left join userexams3 f on e.subid=f.id where e.userid=:id ")
    List<Results> findUserExam(String id);
}
//vitaz.dev.studb.entity.Results(userid,examid,subid,date,result,name,ese)
//left join userexams3 on userexams2.subid=userexams3.id