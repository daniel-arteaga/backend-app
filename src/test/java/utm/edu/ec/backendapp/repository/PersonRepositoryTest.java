package utm.edu.ec.backendapp.repository;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.backendapp.entity.Person;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    IPersonRepository personRepository;

    @Test
    public void shouldGetPersonByNameUser(){
        Person personToSave = new Person();
        personToSave.setName("Erick");
        personToSave.setLastname("Arteaga");
        personToSave.setUsername("erick.arteaga");
        personRepository.save(personToSave);

        List<Person> listPerson= personRepository.findPersonByUserName("erick.arteaga");
        Assertions.assertFalse(listPerson.isEmpty(),"should return some elements");
    }

}
