package com.example.demo.dto;


import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    private String id;
    private String body;
    private String type;
    private List<String> options;

}
