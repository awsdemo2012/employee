package com.springboot.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
 
public class Employee {
 
    private long id;

    private String firstName;

    private String lastName;

    public Employee(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @ApiModelProperty(notes = "The First Name of the user", required = true)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @ApiModelProperty(notes = "The First Name of the user", required = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}