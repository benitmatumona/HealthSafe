package com.benitmatumona.healthsafe.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;


public class AppointmentRequest {


    @NotNull(message = "Patient ID is required")
    private Long patientId;


    @NotNull(message = "Doctor ID is required")
    private Long doctorId;


    @NotNull(message = "Appointment date is required")
    private LocalDateTime appointmentDate;


    @NotBlank(message = "Reason is required")
    private String reason;



    public Long getPatientId() {
        return patientId;
    }


    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }


    public Long getDoctorId() {
        return doctorId;
    }


    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }


    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }


    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }


    public String getReason() {
        return reason;
    }


    public void setReason(String reason) {
        this.reason = reason;
    }

}

