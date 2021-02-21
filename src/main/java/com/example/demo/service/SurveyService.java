package com.example.demo.service;

import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public Flux<Survey> findAll(){
        return this.surveyRepository.findAll();
    }

}
