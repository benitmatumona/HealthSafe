package com.benitmatumona.healthsafe.controller;


import com.benitmatumona.healthsafe.dto.DoctorRequest;
import com.benitmatumona.healthsafe.model.Doctor;
import com.benitmatumona.healthsafe.service.DoctorService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/doctors")
public class DoctorController {


    private final DoctorService doctorService;


    public DoctorController(DoctorService doctorService){

        this.doctorService = doctorService;

    }



    @GetMapping
    public List<Doctor> getDoctors(){

        return doctorService.getAllDoctors();

    }



    @PostMapping
    public Doctor createDoctor(
            @Valid @RequestBody DoctorRequest request
    ){

        Doctor doctor = new Doctor();

        doctor.setFirstName(request.getFirstName());
        doctor.setLastName(request.getLastName());
        doctor.setSpecialization(request.getSpecialization());
        doctor.setEmail(request.getEmail());


        return doctorService.addDoctor(doctor);

    }

}
