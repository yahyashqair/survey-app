package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.model.Submission;
import com.example.demo.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.management.monitor.MonitorNotification;
import java.util.logging.Level;

import static java.util.logging.Level.INFO;

@RestController
@RequestMapping("users/")
@Log
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{email}/{surveyId}")
    public Flux<Submission> getMySubmission(@PathVariable String email, @PathVariable String surveyId){
        return this.userService.getSubmissionByEmailAndSurveyId(email,surveyId);
    }
    @PostMapping("/")
    public Mono<Boolean> login(@RequestBody LoginRequest loginRequest){
        log.log(INFO,loginRequest.toString());
        return Mono.just(true);
    }

}
