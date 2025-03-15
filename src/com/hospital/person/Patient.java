package com.hospital.person;

//Child class of Person
//Attributes - id and name (inherited from Person), DOB, Address, Contact No., Medical Records (obj of Medical Records Class)
//Methods - getter and setter, overriding abstract method displayDetails

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person{
    private String dob; //Format - dd/mm/yyyy
    private String address;
    private String contactNumber;
    private List <String> medicalRecords;

    public Patient(int id, String name, String dob, String address, String contactNumber) {
        super(id, name);
        this.dob = dob;
        this.address = address;
        this.contactNumber = contactNumber;
        this.medicalRecords = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void addMedicalRecord(String record) {
        medicalRecords.add(record);
    }

    public String getMedicalRecord(){
        if (medicalRecords.isEmpty()) {
            return "No medical records available.";

        }
        for (String record : medicalRecords) {
            return  record;
        }
        return null;
    }

    @Override
    public void displayDetails(){
        System.out.println("Details of Patient are : " +
                "Patient Id -> "+getId()+
                ", Name -> "+getName()+
                ", Date of Birth -> "+dob+
                ", Address -> "+address+
                ", Contact Details -> "+contactNumber);
    }

    @Override
    public String toString(){
        return "Details of Patient are : " +
                "Patient Id -> "+getId()+
                ", Name -> "+getName()+
                ", Date of Birth -> "+dob+
                ", Address -> "+address+
                ", Contact Details -> "+contactNumber;
    }
}