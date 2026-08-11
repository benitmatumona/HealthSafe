package com.benitmatumona.healthsafe.service;


import com.benitmatumona.healthsafe.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DoctorService {


    private final List<Doctor> doctors = new ArrayList<>();


    public List<Doctor> getAllDoctors(){

        return doctors;

    }

    public boolean existsById(Long id){

	return doctors.stream()
	            .anyMatch(doctor -> doctor.getId().equals(id));

    }


    public Doctor addDoctor(Doctor doctor){

        doctor.setId((long) (doctors.size() + 1));

        doctors.add(doctor);

        return doctor;

    }

}
