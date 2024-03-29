package com.example.demo.config;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionTypes;
import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import lombok.extern.java.Log;
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
        surveyRepository.deleteAll().subscribe();
        Question question1 = Question.builder().body("What is your name?").type(QuestionTypes.SHORT.getValue()).options(null).build();
        Question question2 = Question.builder()
                .body("How old are you?")
                .type(QuestionTypes.TEST_AREA.getValue())
                .options(null).build();
        Survey survey = Survey.builder()
                .name("full")
                .description("Feel free to put any information you want!")
                .questionSet(Set.of(question1, question2)).build();
        surveyRepository.save(survey).subscribe(survey1 -> {
            System.out.println("Done Heeey");
        });
        Question question12 = Question.builder().body("What is your name?").type(QuestionTypes.TEXT.getValue()).options(null).build();
        Question question22 = Question.builder()
                .body("How old are you?")
                .type(QuestionTypes.TRUE_FALSE.getValue())
                .options(null).build();
        Survey survey2 = Survey.builder()
                .name("quick")
                .description("Feel free to put any information you want!")
                .questionSet(Set.of(question12, question22)).build();
        surveyRepository.save(survey2).subscribe(survey1 -> {
            System.out.println("Done Heey");
        });
        surveyRepository.findAll().subscribe(System.out::println);
    }
}
