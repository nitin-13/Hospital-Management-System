package com.hospital.hospitalmodel;

import com.hospital.person.Doctor;
import com.hospital.person.Patient;
import java.util.Date;

//Attributes - Object of doctor, patient and date class.

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Date date;


    public Appointment(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }

    public void displayAppointmentDetais(){
        System.out.println("Patient "+patient.getName()+" has appointment with Dr. "+doctor.getName()+" on "+date);
    }


    @Override
    public String toString() {
        return "Appointment [" +
                "Doctor=" + doctor +
                ", Patient=" + patient +
                ", Date=" + date +
                ']';
    }
}