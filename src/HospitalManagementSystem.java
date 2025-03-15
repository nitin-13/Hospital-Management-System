import com.hospital.Exceptions.AppointmentNotFoundException;
import com.hospital.Exceptions.DoctorNotFoundException;
import com.hospital.Exceptions.PatientNotFoundException;
import com.hospital.hospitalmodel.Appointment;
import com.hospital.hospitalmodel.HospitalService;
import com.hospital.person.Doctor;
import com.hospital.person.Patient;

import javax.print.Doc;
import java.util.Date;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        HospitalService hospital = new HospitalService();

        try {

            //Add Patients
            Patient patient1 = new Patient(1, "NS", "13/11/1998", "Tuem Pernem Goa", "9158926886");
            Patient patient2 = new Patient(2, "US", "14/11/1998", "Pernem Goa", "8788246737");
            Patient patient3 = new Patient(3, "Babu", "13/11/2024", "Goa", "2240284");

            hospital.addPatient(patient1);
            hospital.addPatient(patient2);
            hospital.addPatient(patient3);

            //Add Doctors
            Doctor doctor1 = new Doctor(111, "Nitin", "Heart Surgeon", "Cardiology");
            Doctor doctor2 = new Doctor(222, "Utkarsh", "Pediatrician", "Pediatrics");
            Doctor doctor3 = new Doctor(333, "Sailee", "Gynac", "Gynecology");

            hospital.addDoctor(doctor1);
            hospital.addDoctor(doctor2);
            hospital.addDoctor(doctor3);

            //Create Appointment
            Date appointmentDate = new Date();
            hospital.scheduleAppointment(patient1, doctor1, appointmentDate);

            //Find particular patient
            Patient fetchPatient = hospital.findPatient(1);
            fetchPatient.displayDetails();

            //Find particular appointment
            Appointment fetchAppointment = hospital.findAppointment(doctor1, patient1, appointmentDate);
            fetchAppointment.displayAppointmentDetais();

            //Find particular doctor
            Doctor fetchDoctor = hospital.findDoctor(111);
            fetchDoctor.displayDetails();

            //Add and display a medical record for a patient
            fetchPatient.getMedicalRecord().addMedicalRecord("Has Sinus");
            System.out.println("Patient "+fetchPatient.getId()+" "+fetchPatient.getMedicalRecord().displayMedicalRecords());

            //Display all doctors
            System.out.println("Print all Doctors : ");
            hospital.displayAllDoctors();

            //Display all patients
            System.out.println("Print all Patients : ");
            hospital.displayAllPatients();

            //display all appointments
            System.out.println("Print all Appointments : ");
            hospital.displayAllAppointments();

        } catch (PatientNotFoundException | DoctorNotFoundException | AppointmentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}