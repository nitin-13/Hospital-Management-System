package com.hospital.hospitalmodel;

import java.util.ArrayList;
import java.util.List;

//Attributes records - arraylist of medical records

public class MedicalRecord {
    private List<String> records;

    public MedicalRecord(){
        this.records = new ArrayList<>();
    }

    public void addMedicalRecord(String record){
        records.add(record);
    }

    public String displayMedicalRecords() {
        if (records.isEmpty()) {
            return "No medical records available.";

        }
        for (String record : records) {
            return  record;
        }
        return null;
    }
}