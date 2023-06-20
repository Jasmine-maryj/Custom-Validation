package com.dev.validatn;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EmailIdValidator implements ConstraintValidator<ValidateEmailID, String> {

    private String eRegex = "\"^[_A-Za-z0-9-+]+\\n\" +\n" +
            "            \"(.[_A-Za-z0-9-]+)*@\\\" + \\\"[A-Za-z0-9-]+(.[A-Za-z0-9]+)*\\n\" +\n" +
            "            \"(.[A-Za-z]{2,})$\"";

    @Override
    public void initialize(ValidateEmailID constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return isValidEmail(s, eRegex);
    }

    public boolean isValidEmail(String email, String regex){
        return Pattern.compile(regex)
                .matcher(email)
                .matches();
    }

}
