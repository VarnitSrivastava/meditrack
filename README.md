Project Structure

com.airtribe.meditrack
│
├── Main.java
│
├── constants
├── entity
├── service
├── util
├── exception
├── interfaces
├── enums
└── test

 Features
Core Functionalities

Add / View / Delete Doctors
Add / View / Delete Patients
Search Patients (by ID / Name / Age)
Appointment creation & status tracking
Billing with tax calculation
Menu-driven console UI

OOP Concepts Implemented
🔹 Encapsulation

Private fields with getters/setters

Centralized validation via Validator

🔹 Inheritance
Person → Doctor, Patient
Constructor chaining using super

🔹 Polymorphism
Method Overloading → searchPatient()
Method Overriding → calculateAmount()
Dynamic Dispatch via Payable

🔹 Abstraction
Abstract class: MedicalEntity
Interfaces: Payable, Searchable

Advanced Java Features

Feature                   	Implementation

Enums               -      	Specialization, AppointmentStatus
Immutable Class	    -        BillSummary
Deep Copy	          -        Cloneable in Patient, Appointment
Generics	          -        DataStore<T>
Custom Exceptions	  -        InvalidDataException, AppointmentNotFoundException
Singleton Pattern	  -        IdGenerator
Static Blocks	      -        Application initialization
File I/O (Bonus)	  -        CSV Persistence
