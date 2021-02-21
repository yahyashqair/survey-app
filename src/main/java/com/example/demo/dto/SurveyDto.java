package com.example.demo.dto;

import com.example.demo.model.Question;
import lombok.Data;

import java.util.Set;

@Data
public class SurveyDto {
    private String id;
    private String name;
    private String description;
    private Set<Question> questionSet;
}
