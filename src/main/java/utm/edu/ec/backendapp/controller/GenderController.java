package utm.edu.ec.backendapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.backendapp.entity.Gender;

import utm.edu.ec.backendapp.service.IGenderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/gender")
@CrossOrigin(origins = "http://localhost:4200")
public class GenderController {
    @Autowired
    private IGenderService genderService;

    @PostMapping()
    public void saveGender(@RequestBody Gender gender){genderService.saveGender(gender);}

    @GetMapping()
    public List<Gender> findGenders(){
        return genderService.findGenders();
    }

    @DeleteMapping()
    public void deleteGender(@RequestParam UUID id){
        genderService.deleteGender(id);
    }

}
