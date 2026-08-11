package com.benitmatumona.healthsafe.service;

import com.benitmatumona.healthsafe.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PatientService {

    private final List<Patient> patients = new ArrayList<>();


    public List<Patient> getAllPatients() {
        return patients;
    }


    public Patient addPatient(Patient patient) {

        patient.setId((long) (patients.size() + 1));

        patients.add(patient);

        return patient;
    }
}
