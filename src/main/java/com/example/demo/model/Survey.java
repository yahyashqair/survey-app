package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
public class Survey {

    @Id
    private Long id;
    private String name;
    private String discription;
    private Set<Question> questionSet;
}
