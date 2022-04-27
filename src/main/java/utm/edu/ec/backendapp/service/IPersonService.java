package utm.edu.ec.backendapp.service;

import utm.edu.ec.backendapp.entity.Person;

import java.util.List;

public interface IPersonService {
    void savePerson(Person person);
    List<Person> findPersons();
}
