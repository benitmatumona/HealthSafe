package com.benitmatumona.healthsafe.model;


public class Doctor {

    private Long id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String email;


    public Doctor() {
    }


    public Doctor(
            Long id,
            String firstName,
            String lastName,
            String specialization,
            String email
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.email = email;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


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


    public String getSpecialization() {
        return specialization;
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

}
