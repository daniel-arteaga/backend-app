package utm.edu.ec.backendapp.service;

import utm.edu.ec.backendapp.entity.Person;

import java.util.List;
import java.util.UUID;

public interface IPersonService {
    void savePerson(Person person);
    void deletePerson(UUID id);
    List<Person> findPersons();
    List<Person> findPersonByUserName(String value);
}
