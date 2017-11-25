package com.rabbit.validation;

import com.rabbit.validation.Gender.GenderType;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: guoyankui
 * @DATE: 24/11/2017 3:53 AM
 */
public class ValidationMain {

    public static void main(String[] args) {
        ModelTest modelTest = new ModelTest();
        modelTest.setAge(12);
        modelTest.setSchool("beijing");
        modelTest.setName("");
        modelTest.setAddress(12);
        modelTest.setGender(GenderType.MALE);
        try {
            validationObjectT(modelTest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void validationObject(ModelTest modelTest) throws Exception{
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<ModelTest>> violations = validator.validate(modelTest);

        if (violations.size() != 0) {
            throw new Exception(violations.toString());
        }

        System.out.println(violations);
    }

    public static <T> void validationObjectT(T modelTest) throws Exception{
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(modelTest);

        if (violations.size() != 0) {
            throw new Exception(violations.toString());
        }

        System.out.println(violations);
    }


}
