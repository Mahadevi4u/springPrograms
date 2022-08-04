package com.example.database.jdbc;

import com.example.database.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> getData(){
        return jdbcTemplate.query("select * from Person",new BeanPropertyRowMapper(Person.class));
    }
    public Person findById(int id){
        return jdbcTemplate.queryForObject("select * from Person where id=?",new Object[]{2},new BeanPropertyRowMapper<Person>(Person.class));
    }

}
