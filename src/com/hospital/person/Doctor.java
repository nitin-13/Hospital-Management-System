package com.hospital.person;

//Child class of Person
//Attributes - id and name (inherited from Person), specialization, department
//Methods - getter, overriding abstract method displayDetails

public class Doctor extends Person{
    private String specialization;
    private String department;

    public Doctor(int id, String name, String specialization, String department) {
        super(id, name);
        this.specialization = specialization;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails(){
        System.out.println("Details of Doctor are : " +
                "Doctor Id -> "+getId()+
                ", Name -> "+getName()+
                ", Department -> "+department+
                ", Specialization -> "+specialization);
    }

    @Override
    public String toString(){
        return "Details of Doctor are : " +
                "Doctor Id -> "+getId()+
                ", Name -> "+getName()+
                ", Department -> "+department+
                ", Specialization -> "+specialization;
    }
}