package utm.edu.ec.backendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utm.edu.ec.backendapp.entity.Person;

import java.util.List;
import java.util.UUID;

@Repository
public interface IPersonRepository extends JpaRepository<Person, UUID> {
    List<Person> findByName(String name);
}
