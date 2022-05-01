package utm.edu.ec.backendapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.backendapp.entity.Gender;
import utm.edu.ec.backendapp.repository.IGenderRepository;


import java.util.List;
import java.util.UUID;

@Service
public class GenderService implements IGenderService {
    @Autowired
    private IGenderRepository genderRepository;

    @Override
    public void saveGender(Gender gender) {
        genderRepository.save(gender);
    }

    @Override
    public List<Gender> findGenders() {
        return genderRepository.findAll();
    }

    @Override
    public void deleteGender(UUID id) { genderRepository.deleteById(id);}
}
