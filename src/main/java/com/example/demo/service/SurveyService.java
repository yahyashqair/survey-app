package com.example.demo.service;

import com.example.demo.dto.SurveyDto;
import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Flux<SurveyDto> findAll() {
        return this.surveyRepository.findAll().map(survey -> this.modelMapper.map(survey, SurveyDto.class));
    }
    public Flux<SurveyDto> findByName(String name) {
        return this.surveyRepository.findByName(name).map(survey -> this.modelMapper.map(survey, SurveyDto.class));
    }
}
