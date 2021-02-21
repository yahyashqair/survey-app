package com.example.demo.repository;

import com.example.demo.model.Question;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends ReactiveMongoRepository<Question,String> {
}
