package com.example.homework01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")

    public Person getPerson() {
        Person person = new Person();
        person.setName("권유진");
        person.setAge(23);
        person.setJob("학생");
        return person;
    }
}
