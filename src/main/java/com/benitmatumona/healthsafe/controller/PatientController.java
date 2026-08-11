package com.benitmatumona.healthsafe.controller;


import com.benitmatumona.healthsafe.dto.PatientRequest;
import com.benitmatumona.healthsafe.model.Patient;
import com.benitmatumona.healthsafe.service.PatientService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patients")
public class PatientController {


    private final PatientService patientService;


    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }



    @GetMapping
    public List<Patient> getPatients(){

        return patientService.getAllPatients();

    }



    @PostMapping
    public Patient createPatient(
            @Valid @RequestBody PatientRequest request
    ){

        Patient patient = new Patient();

        patient.setFirstName(request.getFirstName());
        patient.setLastName(request.getLastName());
        patient.setEmail(request.getEmail());
        patient.setDateOfBirth(request.getDateOfBirth());


        return patientService.addPatient(patient);

    }

}
