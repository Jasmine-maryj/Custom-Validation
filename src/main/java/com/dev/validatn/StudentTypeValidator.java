package com.dev.validatn;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class StudentTypeValidator implements ConstraintValidator<ValidateStudentType, String> {

    @Override
    public boolean isValid(String studentType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> studentTypeList = Arrays.asList("Regular", "Arrears");
        return studentTypeList.contains(studentType);
    }
}
