package utm.edu.ec.backendapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.backendapp.entity.Person;
import utm.edu.ec.backendapp.repository.IPersonRepository;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService implements IPersonService{

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> findPersons() {
        return personRepository.findAll();
    }

    @Override
    public void deletePerson(UUID id) { personRepository.deleteById(id);}

    @Override
    public List<Person> findPersonByUserName(String value){
        return personRepository.findPersonByUserName(value);
    }

}
