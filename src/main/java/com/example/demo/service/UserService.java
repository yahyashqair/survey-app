package com.example.demo.service;

import com.example.demo.model.Submission;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Flux<Submission> getSubmissionByEmailAndSurveyId(String email, String surveyId){
        return this.userRepository
                .findByEmail()
                .map(User::getSubmissions)
                .flatMapMany(Flux::fromIterable)
                .filter(submission -> submission.getSurveyId().equals(surveyId));
    }

}
