package com.example.demo.config;

import com.example.demo.model.Question;
import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Configuration
@Log
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    private SurveyRepository surveyRepository;

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Override
    public void run(String... args) throws Exception {
//        Question question1 = Question.builder().body("What is your name?").type("normal").options(null).build();
//        Question question2 = Question.builder()
//                .body("How old are you?")
//                .type("normal")
//                .options(null).build();
//        Survey survey = Survey.builder()
//                .name("Full Survey")
//                .discription("Feel free to put any information you want!")
//                .questionSet(Set.of(question1, question2)).build();
//        surveyRepository.save(survey).block();
    }
}
