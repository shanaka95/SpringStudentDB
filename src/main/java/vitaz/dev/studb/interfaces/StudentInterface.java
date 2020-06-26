package vitaz.dev.studb.interfaces;

import org.springframework.data.repository.CrudRepository;
import vitaz.dev.studb.entity.Student;

public interface StudentInterface extends CrudRepository<Student,String> {

}
