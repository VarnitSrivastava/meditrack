package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.patient;
import com.airtribe.meditrack.exception.invalidDataException;
import com.airtribe.meditrack.util.datastore;

import com.airtribe.meditrack.util.validator;


import java.util.List;
import java.util.stream.Collectors;

public class patientservice {

    private final datastore<patient> patientdatastore = new datastore<>();

    public void addpatient(patient patient) {
        if (patient == null) {
            throw new invalidDataException("patient cannot be null");

        }
        validator.validateAge(patient.getAge());
        patientdatastore.add(patient.getId(), patient);

    }

    public patient getpatientById(String id) {
        patient patient = patientdatastore.get(id);
        if (patient == null) {
            throw new invalidDataException("Patient not found with ID:" + id);
        }
        return patient;
    }

    public List<patient> getAllpatient() {
        return patientdatastore.getAll()
                .stream()
                .collect(Collectors.toList());
    }

    public void deletepatient(String id) {
        if (patientdatastore.get(id) == null) {
            throw new invalidDataException("cannot delete. patient not found");
        }
        patientdatastore.remove(id);
    }

    public patient searchPatient(String id) {
        return getpatientById(id);
    }

    public List<patient> searchPatient(String name, boolean byName) {
        return patientdatastore.getAll()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

    }
    public List<patient> searchPatient(int age) {
        return patientdatastore.getAll()
                .stream()
                .filter(p -> p.getAge() == age)
                .collect(Collectors.toList());
    }
    public patient getPatientCopy(String id) {
        patient original = getpatientById(id);
        return original.clone();
    }
}
