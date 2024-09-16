package com.example.RestClient.controller;

import com.example.RestClient.model.Person;
import com.example.RestClient.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/getAllUsers")
    public Person getAllUsers(){
        return personService.getPersons();
    }
}
