package utm.edu.ec.backendapp.repository;

import utm.edu.ec.backendapp.entity.Person;

import java.util.List;

public interface CustomPersonRepository {
    List<Person> findPersonByUserName(String value);
}
