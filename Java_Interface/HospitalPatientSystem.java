package Trainee_class;

import java.time.LocalDate;
public class HospitalPatientSystem {
    
    static class Patient {
        private String patientId;
        private String patientName;
        private int age;

        Patient(String patientId, String patientName, int age) {
            this.patientId = patientId;
            this.patientName = patientName;
            this.age = age;
        }

        public String getPatientId() {
        	return patientId; 
        }
        public String getPatientName() { 
        	return patientName; 
        }
        public int getAge() {
        	return age;
        }
    }
    static class Doctor {
        private String doctorId;
        private String doctorName;
        private String specialization;

        Doctor(String doctorId, String doctorName, String specialization) {
            this.doctorId = doctorId;
            this.doctorName = doctorName;
            this.specialization = specialization;
        }

        public String getDoctorId() {
        	return doctorId;
        	}
        public String getDoctorName() { 
        	return doctorName;
        	}
        public String getSpecialization() {
        	return specialization; 
        	}
    }
    
    static class Appointment {
        private Patient patient;
        private Doctor doctor;
        private LocalDate date;

        Appointment(Patient patient, Doctor doctor, LocalDate date) {
            this.patient = patient;
            this.doctor = doctor;
            this.date = date;
        }

        public void displayDetails() {
            System.out.println("Appointment Details:");
            System.out.println("Patient: " + patient.getPatientName() + " (ID: " + patient.getPatientId() + ")");
            System.out.println("Doctor: " + doctor.getDoctorName() + " (" + doctor.getSpecialization() + ")");
            System.out.println("Date: " + date);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Patient p1 = new Patient("P1", "A", 28);
        Doctor d1 = new Doctor("D2", "Dr.A", "Cardiology");

        Appointment a1 = new Appointment(p1, d1, LocalDate.of(2025, 9, 26));

        a1.displayDetails();
    }
}
