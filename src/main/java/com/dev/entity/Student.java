package com.dev.entity;

import com.dev.validatn.ValidateDOB;
import com.dev.validatn.ValidateEmailID;
import com.dev.validatn.ValidatePassword;
import com.dev.validatn.ValidateStudentType;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Student {
    private Long id;
    @NotNull
    @NotEmpty
    private String firstName;

    private String lastName;

    @ValidateDOB
    private String dob;

    @ValidateEmailID
    private String email;

    @ValidateStudentType(message = "Invalid Student type")
    private String studentType;

    @ValidatePassword
    private String password;
}
