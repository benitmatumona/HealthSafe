package com.benitmatumona.healthsafe.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class PatientRequest {


    @NotBlank(message = "First name is required")
    private String firstName;


    @NotBlank(message = "Last name is required")
    private String lastName;


    @Email(message = "Email must be valid")
    @NotBlank(message = "Email is required")
    private String email;


    @NotNull(message = "Date of birth is required")
    private LocalDate dateOfBirth;



    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

