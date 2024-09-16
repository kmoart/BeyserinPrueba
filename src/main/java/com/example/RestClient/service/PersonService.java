package com.example.RestClient.service;

import com.example.RestClient.model.Person;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;



@Service
@AllArgsConstructor
@NoArgsConstructor
public class PersonService {

    @Autowired
    private RestClient restClient;


    public Person getPersons(){
        return restClient.get()
                .uri("/getAll")
                .retrieve()
                .body(Person.class);
    }
}
