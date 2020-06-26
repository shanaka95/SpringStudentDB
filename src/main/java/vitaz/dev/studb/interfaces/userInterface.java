package vitaz.dev.studb.interfaces;

import org.springframework.data.repository.CrudRepository;

import vitaz.dev.studb.entity.User;

public interface userInterface extends CrudRepository<User,String> {

}
