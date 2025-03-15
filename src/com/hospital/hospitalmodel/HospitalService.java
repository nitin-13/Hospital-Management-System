package com.hospital.hospitalmodel;

import com.hospital.Exceptions.AppointmentNotFoundException;
import com.hospital.Exceptions.DoctorNotFoundException;
import com.hospital.Exceptions.PatientNotFoundException;
import com.hospital.person.Doctor;
import com.hospital.person.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalService {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HospitalService(){
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, Date date){
        appointments.add(new Appointment(doctor,patient,date));
    }

    public Patient findPatient(int id) throws PatientNotFoundException {
        for(Patient patient : patients){
            if(patient.getId() == id){
                return patient;
            }
        }
        throw new PatientNotFoundException("ERROR : Patient with "+id+" not found");
    }

    public Doctor findDoctor(int id) throws DoctorNotFoundException {
        for(Doctor doctor : doctors){
            if(doctor.getId() == id){
                return doctor;
            }
        }
        throw new DoctorNotFoundException("ERROR : Doctor with "+id+" not found");
    }

    public Appointment findAppointment(Doctor doctor,Patient patient,Date date) throws AppointmentNotFoundException {
        for(Appointment appointment : appointments){
            if (appointment.getDoctor().equals(doctor) && appointment.getPatient().equals(patient) && appointment.getDate().equals(date)) {
                return appointment;
            }
        }
        throw new AppointmentNotFoundException("ERROR : Appointment not found");
    }

    public void displayAllDoctors(){
        if (doctors.isEmpty()) {
            System.out.println("No doctors available");
        }else {
            for(Doctor doctor : doctors){
                System.out.println(doctor);
            }
        }
    }

    public void displayAllPatients(){
        if (patients.isEmpty()) {
            System.out.println("No patients available");
        }else {
            for(Patient patient : patients){
                System.out.println(patient);
            }
        }
    }

    public void displayAllAppointments(){
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled");
        }else {
            for(Appointment appointment : appointments){
                System.out.println(appointment);
            }
        }
    }
}