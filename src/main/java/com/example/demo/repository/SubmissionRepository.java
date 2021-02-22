package com.example.demo.repository;

import com.example.demo.model.Submission;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SubmissionRepository extends ReactiveMongoRepository<Submission,String> {
}
