package com.example.database.JPA;

import com.example.database.bean.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {
    //connect to the database
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public Person findById(int id){
//        return entityManager.find(Person.class,id);
//    }
//    public Person update(Person person){
//        return entityManager.merge(person);
//    }
////    public Person insert(Person person){
////        return entityManager.merge(person);
////    }
//    /*public void delete(int id){
//        Person person = findById(id);
//        entityManager.remove(person);
//    }*/
//    public List<Person> findAll(){
//         TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
//         return namedQuery.getResultList();
//    }

}
