package com.mycompany.mybatis.service;


import com.mycompany.mybatis.mapper.PersonMapper;
import com.mycompany.mybatis.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> getAllPersons() {
        return personMapper.selectAll();
    }
//
//    public Person getPersonById(String id) {
//        return personMapper.selectById(id);
//    }
//
//    public void createPerson(Person person) {
//        personMapper.insert(person);
//    }
//
//    public void updatePerson(Person person) {
//        personMapper.update(person);
//    }
//
//    public void deletePerson(String id) {
//        personMapper.delete(id);
//    }
}
