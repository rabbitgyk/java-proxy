package com.rabbit.validation.Gender;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: guoyankui
 * @DATE: 25/11/2017 2:11 PM
 */
public class GenderTypeValidator implements ConstraintValidator<GenderCase, GenderType> {

    GenderType value;

    public void initialize(GenderCase constraintAnnotation) {
        value = constraintAnnotation.value();
    }

    public boolean isValid(GenderType obj, ConstraintValidatorContext context) {
        if (value != null && obj != null && value != obj) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("gender should be " + value + "| the value is " + obj)
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
