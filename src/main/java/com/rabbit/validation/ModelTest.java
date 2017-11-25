package com.rabbit.validation;

import com.rabbit.validation.Gender.GenderCase;
import com.rabbit.validation.Gender.GenderType;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Author: guoyankui
 * @DATE: 24/11/2017 3:42 AM
 */
public class ModelTest {

    @Max(23)
    private int age;
    @NotNull
    private String name;
    @NotEmpty
    private String school;
    @DecimalMax("21")
    private int address;
    @GenderCase(GenderType.FEMALE)
    private GenderType gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
