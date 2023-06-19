package com.dev.validatn;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = StudentTypeValidator.class)
public @interface ValidateStudentType {
    String message() default "Invalid student type";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
