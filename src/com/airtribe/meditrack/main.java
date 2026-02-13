package com.airtribe.meditrack;

import com.airtribe.meditrack.entity.doctor;
import com.airtribe.meditrack.entity.patient;
import com.airtribe.meditrack.enums.Specialization;
import com.airtribe.meditrack.exception.invalidDataException;
import com.airtribe.meditrack.service.doctorservice;
import com.airtribe.meditrack.service.patientservice;
import com.airtribe.meditrack.util.Idgenerator;

import java.util.List;
import java.util.Scanner;

public class main {
   // public static void main(String[] args){
      //  System.out.println("Welcome to mediTrack");
    //}
   private static final doctorservice doctorService = new doctorservice();
    private static final patientservice patientService = new patientservice();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("MediTrack Application Started");
    }
    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {
            showMenu();

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> adddoctor();
                    case 2 -> addpatient();
                    case 3 -> viewAlldoctors();
                    case 4 -> viewAllpatients();
                    case 5 -> searchpatient();
                    case 0 -> exit = true;
                    default -> System.out.println("Invalid choice");
                }

            } catch (invalidDataException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thank you for using MediTrack");
    }

    private static void searchpatient() {

    }

    private static void viewAllpatients() {
    }

    private static void viewAlldoctors() {

    }

    private static void addpatient() {

    }

    private static void adddoctor() {
    }

    private static void showMenu() {
        System.out.println("""
                \n--- MediTrack Menu ---
                1. Add Doctor
                2. Add Patient
                3. View All Doctors
                4. View All Patients
                5. Search Patient
                0. Exit
                Enter choice:
                """);
    }
// ============= Doctor ==========//

    private static void addDoctor() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Fee: ");
        double fee = Double.parseDouble(scanner.nextLine());

        System.out.print("Specialization (CARDIOLOGY / DERMATOLOGY / ORTHOPEDIC / GENERAL): ");
        Specialization specialization =
                Specialization.valueOf(scanner.nextLine().toUpperCase());

        String id = Idgenerator.getInstance().generateId();

        doctor doctor = new doctor(id, name, age, specialization, fee);
        doctorService.adddoctor(doctor);

        System.out.println("Doctor added with ID: " + id);
    }


    private static void addPatient() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Disease: ");
        String disease = scanner.nextLine();

        String id = Idgenerator.getInstance().generateId();

        patient patient = new patient(id, name, age, disease);
        patientService.addpatient(patient);

        System.out.println("Patient added with ID: " + id);
    }
    private static void viewAllDoctors() {
        List<doctor> doctors = doctorservice.getAlldoctor();
        doctors.forEach(d ->
                System.out.println(d.getid() + " - " + d.getName()));
    }

    private static void viewAllPatients() {
        List<patient> patients = patientService.getAllpatient();
        patients.forEach(p ->
                System.out.println(p.getId() + " - " + p.getName()));
    }

    private static void searchPatient() {
        System.out.print("Search by (1) ID (2) Name (3) Age: ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1 -> {
                System.out.print("Enter ID: ");
                patient p = patientService.searchPatient(scanner.nextLine());
                System.out.println(p.getName() + ", Age: " + p.getAge());
            }
            case 2 -> {
                System.out.print("Enter Name: ");
                List<patient> list =
                        patientService.searchPatient(scanner.nextLine(), true);
                list.forEach(p -> System.out.println(p.getName()));
            }
            case 3 -> {
                System.out.print("Enter Age: ");
                List<patient> list =
                        patientService.searchPatient(
                                Integer.parseInt(scanner.nextLine()));
                list.forEach(p -> System.out.println(p.getName()));
            }
            default -> System.out.println("Invalid search option");
        }
    }

}
