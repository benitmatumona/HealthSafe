package com.benitmatumona.healthsafe.controller;


import com.benitmatumona.healthsafe.dto.AppointmentRequest;
import com.benitmatumona.healthsafe.model.Appointment;
import com.benitmatumona.healthsafe.service.AppointmentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/appointments")
public class AppointmentController {


    private final AppointmentService appointmentService;



    public AppointmentController(AppointmentService appointmentService){

        this.appointmentService = appointmentService;

    }



    @GetMapping
    public List<Appointment> getAppointments(){

        return appointmentService.getAllAppointments();

    }



    @PostMapping
    public Appointment createAppointment(
            @Valid @RequestBody AppointmentRequest request
    ){


        Appointment appointment = new Appointment();


        appointment.setPatientId(request.getPatientId());

        appointment.setDoctorId(request.getDoctorId());

        appointment.setAppointmentDate(request.getAppointmentDate());

        appointment.setReason(request.getReason());


        return appointmentService.addAppointment(appointment);

    }

}
