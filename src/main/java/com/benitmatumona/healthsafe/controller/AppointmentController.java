package com.benitmatumona.healthsafe.controller;


import com.benitmatumona.healthsafe.dto.AppointmentRequest;
import com.benitmatumona.healthsafe.exception.ResourceNotFoundException;
import com.benitmatumona.healthsafe.model.Appointment;
import com.benitmatumona.healthsafe.service.AppointmentService;
import com.benitmatumona.healthsafe.service.DoctorService;
import com.benitmatumona.healthsafe.service.PatientService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/appointments")
public class AppointmentController {


    private final AppointmentService appointmentService;
    private final PatientService patientService;
    private final DoctorService doctorService;



    public AppointmentController(
            AppointmentService appointmentService,
            PatientService patientService,
            DoctorService doctorService
    ){

        this.appointmentService = appointmentService;
        this.patientService = patientService;
        this.doctorService = doctorService;

    }



    @GetMapping
    public List<Appointment> getAppointments(){

        return appointmentService.getAllAppointments();

    }



    @PostMapping
    public Appointment createAppointment(
            @Valid @RequestBody AppointmentRequest request
    ){

        if (!patientService.existsById(request.getPatientId())) {
            throw new ResourceNotFoundException(
                    "Patient not found with id: " + request.getPatientId()
            );
        }

        if (!doctorService.existsById(request.getDoctorId())) {
            throw new ResourceNotFoundException(
                    "Doctor not found with id: " + request.getDoctorId()
            );
        }

        Appointment appointment = new Appointment();


        appointment.setPatientId(request.getPatientId());

        appointment.setDoctorId(request.getDoctorId());

        appointment.setAppointmentDate(request.getAppointmentDate());

        appointment.setReason(request.getReason());


        return appointmentService.addAppointment(appointment);

    }

}
