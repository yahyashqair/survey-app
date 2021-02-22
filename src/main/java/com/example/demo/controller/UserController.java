package com.example.demo.controller;

import com.example.demo.model.Submission;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{email}/{surveyId}")
    public Flux<Submission> getMySubmission(@PathVariable String email, @PathVariable String surveyId){
        return this.userService.getSubmissionByEmailAndSurveyId(email,surveyId);
    }

}
