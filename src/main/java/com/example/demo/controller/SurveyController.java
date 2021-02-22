package com.example.demo.controller;

import com.example.demo.dto.SurveyDto;
import com.example.demo.model.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/")
    Flux<SurveyDto> getAllSurveys(){
        return this.surveyService.findAll();
    }

    @GetMapping("/{name}")
    Flux<SurveyDto> getQuickSurvey(@PathVariable String name){
        return this.surveyService.findByName(name);
    }

}
