package com.example.demo.controller;

import com.example.demo.dto.SurveyDto;
import com.example.demo.model.Submission;
import com.example.demo.model.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/survey")
@CrossOrigin("*")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/")
    Flux<SurveyDto> getAllSurveys(){
        return this.surveyService.findAll();
    }

    @GetMapping("/{name}")
    Mono<SurveyDto> getSurvey(@PathVariable String name){
        return this.surveyService.findByName(name);
    }

    @PostMapping
    Mono<Boolean> submit(@RequestBody Submission submission){

    }

}
