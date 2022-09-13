package com.example.peopledocker.Controller;




import com.example.peopledocker.Model.People;
import com.example.peopledocker.Repository.PeopleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    private PeopleRepository peopleRepository;

    public PeopleController(PeopleRepository peopleRepository){
        this.peopleRepository = peopleRepository;

    }
    //test people
    @GetMapping("/")
    public ResponseEntity<People> people() {
        People people = new People("Johny");
        peopleRepository.save(people);
        return new ResponseEntity<>(people, HttpStatus.OK);

    }}
