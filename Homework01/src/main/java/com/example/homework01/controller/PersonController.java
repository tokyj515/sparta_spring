package com.example.homework01.controller;

import com.example.homework01.domain.Person;
import com.example.homework01.domain.PersonRepository;
import com.example.homework01.domain.PersonRequestDto;
import com.example.homework01.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;
    private final PersonRepository personRepository;


    /*
    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("권유진");
        person.setAge(23);
        person.setJob("학생");
        return person;
    }*/


    //GET
    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }


    //POST
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {

        Person person = new Person(requestDto);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return personRepository.save(person);
    }



    //PUT
    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }



    //DELETE
    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }




}
