package com.adina.eduapp.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import com.adina.eduapp.validator.AllowedValuesValidator;


import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AllowedValuesValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowedValues {
    String[] values();
    String message() default "Value must be one of: {values}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}