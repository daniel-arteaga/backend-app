package utm.edu.ec.backendapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    //@Column(nullable = false)
    private String name;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    private String username;
    private String userpass;
    @ManyToOne
    private Gender gender;
}
