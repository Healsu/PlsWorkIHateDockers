package com.example.peopledocker.Repository;


import com.example.peopledocker.Model.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People,Long> {
}
