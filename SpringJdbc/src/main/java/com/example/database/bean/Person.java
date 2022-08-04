package com.example.database.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_persons",query="select p from Person p")
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    private String email;

    public Person() {
    }

    public Person(int id,String name, String location, String email) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
