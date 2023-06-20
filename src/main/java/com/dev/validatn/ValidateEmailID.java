package com.dev.validatn;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmailIdValidator.class)
public @interface ValidateEmailID {
    String message() default "Invalid Email Id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
