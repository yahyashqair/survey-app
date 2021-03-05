package com.example.demo.model;

public enum QuestionTypes {
    RANGE("range"),
    MULTI_CHOICE("multiChoice"),
    TEST_AREA("testArea"),
    TRUE_FALSE("trueAndFalse"),
    TEXT("text"),
    SHORT("short");
    private final String value;

    QuestionTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
