package com.dev.entity;

import com.dev.validatn.ValidateStudentType;


public class Student {
    private Long id;
    private String firstName;
    private String lastName;

    @ValidateStudentType(message = "Invalid Student type")
    private String studentType;
}
