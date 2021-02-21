package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Question {
    @Id
    private Long id;
    private String body;
    private String type;
    private List<String> options;
}
