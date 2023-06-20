package com.dev.validatn;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DOBValidator implements ConstraintValidator<ValidateDOB, String> {

    private Pattern pattern;
    private Matcher matcher;

    private static Pattern DOB_PATTERN = Pattern.compile( "\"^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\\\d\\\\d$\"");

    @Override
    public void initialize(ValidateDOB constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String dob, ConstraintValidatorContext constraintValidatorContext) {
        return isValidDOB(dob, DOB_PATTERN);
    }

    private boolean isValidDOB(String dob, Pattern dobPattern) {
        return dobPattern.matcher(dob).matches();
    }
}
