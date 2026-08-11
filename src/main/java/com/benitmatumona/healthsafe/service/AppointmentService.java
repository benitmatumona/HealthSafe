package com.benitmatumona.healthsafe.service;


import com.benitmatumona.healthsafe.model.Appointment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AppointmentService {


    private final List<Appointment> appointments = new ArrayList<>();



    public List<Appointment> getAllAppointments(){

        return appointments;

    }



    public Appointment addAppointment(Appointment appointment){

        appointment.setId((long) (appointments.size() + 1));

        appointments.add(appointment);

        return appointment;

    }

}
