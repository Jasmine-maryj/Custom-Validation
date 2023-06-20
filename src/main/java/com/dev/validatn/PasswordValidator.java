package com.dev.validatn;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<ValidatePassword, String> {

    private Pattern pattern;

    private Matcher matcher;

    private String pRegex = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$\"";

    @Override
    public void initialize(ValidatePassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        return isValidPassword(password, pRegex);
    }

    public boolean isValidPassword(String password, String pRegex){
        pattern = Pattern.compile(pRegex);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
