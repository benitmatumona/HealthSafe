package com.benitmatumona.healthsafe.model;


import java.time.LocalDateTime;


public class Appointment {


    private Long id;

    private Long patientId;

    private Long doctorId;

    private LocalDateTime appointmentDate;

    private String reason;



    public Appointment() {
    }



    public Appointment(
            Long id,
            Long patientId,
            Long doctorId,
            LocalDateTime appointmentDate,
            String reason
    ) {

        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.reason = reason;

    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


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
