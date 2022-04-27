package utm.edu.ec.backendapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.backendapp.entity.Person;
import utm.edu.ec.backendapp.service.IPersonService;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/person")
public class PersonController {

    @Autowired

    private IPersonService personService;

    @PostMapping()
    public void savePerson(@RequestBody Person person){
        personService.savePerson(person);
    }

    @GetMapping()
    public List<Person> findPersons(){
        return personService.findPersons();

    }

    @DeleteMapping()
    public void deletePerson(@RequestParam UUID id){
        personService.deletePerson(id);
    }
}
