package vitaz.dev.studb.interfaces;

import org.springframework.data.repository.CrudRepository;
import vitaz.dev.studb.entity.Subjects;

public interface SubjectInterface extends CrudRepository<Subjects,String> {

}
