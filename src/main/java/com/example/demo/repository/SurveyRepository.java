package com.example.demo.repository;

import com.example.demo.model.Survey;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface SurveyRepository extends ReactiveMongoRepository<Survey,String>{

    Mono<Survey> findByName(String string);
}
