package utm.edu.ec.backendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.backendapp.entity.Gender;

import java.util.UUID;

public interface IGenderRepository extends JpaRepository<Gender, UUID> {

}
