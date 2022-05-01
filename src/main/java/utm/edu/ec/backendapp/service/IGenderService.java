package utm.edu.ec.backendapp.service;

import utm.edu.ec.backendapp.entity.Gender;

import java.util.List;
import java.util.UUID;

public interface IGenderService {
    void saveGender(Gender gender);
    void deleteGender(UUID id);
    List<Gender> findGenders();
}
