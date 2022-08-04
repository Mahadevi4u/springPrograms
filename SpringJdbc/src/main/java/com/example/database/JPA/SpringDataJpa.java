package com.example.database.JPA;

import com.example.database.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpa extends JpaRepository<Person,Integer> {
}
