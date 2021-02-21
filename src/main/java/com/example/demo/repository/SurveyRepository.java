package com.example.demo.repository;

import com.example.demo.model.Survey;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends ReactiveMongoRepository<Survey,Long>{

}
