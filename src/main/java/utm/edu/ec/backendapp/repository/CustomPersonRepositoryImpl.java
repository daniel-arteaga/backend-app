package utm.edu.ec.backendapp.repository;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.backendapp.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CustomPersonRepositoryImpl implements CustomPersonRepository{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Person> findPersonByUserName(String value){
        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> query=cb.createQuery(Person.class);
        Root<Person> person = query.from(Person.class);
        List<Predicate> predicates= new ArrayList<>();

        Path<String> valuePath=person.get("username");
        predicates.add(cb.equal(valuePath,value));

        query.select(person).where(cb.or(predicates.toArray(new Predicate[0])));
        return entityManager.createQuery(query).getResultList();
    }
}
