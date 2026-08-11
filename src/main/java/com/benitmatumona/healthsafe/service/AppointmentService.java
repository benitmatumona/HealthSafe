package com.benitmatumona.healthsafe.service;


import com.benitmatumona.healthsafe.exception.ResourceNotFoundException;
import com.benitmatumona.healthsafe.model.Appointment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AppointmentService {


    private final List<Appointment> appointments = new ArrayList<>();

    private final PatientService patientService;

    private final DoctorService doctorService;



    public AppointmentService(
            PatientService patientService,
            DoctorService doctorService
    ){

        this.patientService = patientService;
        this.doctorService = doctorService;

    }



    public List<Appointment> getAllAppointments(){

        return appointments;

    }



    public Appointment addAppointment(Appointment appointment){


        if(!patientService.existsById(appointment.getPatientId())){

            throw new ResourceNotFoundException(
                    "Patient not found: "
                    + appointment.getPatientId()
            );

        }



        if(!doctorService.existsById(appointment.getDoctorId())){

            throw new ResourceNotFoundException(
                    "Doctor not found: "
                    + appointment.getDoctorId()
            );

        }



        appointment.setId((long)(appointments.size()+1));

        appointments.add(appointment);


        return appointment;

    }

}
