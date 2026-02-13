package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.doctor;
import com.airtribe.meditrack.util.datastore;
import com.airtribe.meditrack.exception.invalidDataException;
import com.airtribe.meditrack.util.validator;
import java.util.List;
import java.util.stream.Collectors;

public class doctorservice {
    private static final datastore<doctor> doctorStore = new datastore<>();

    public void adddoctor(doctor doctor) {
        if (doctor == null) {
            throw new invalidDataException("Doctor canot be null");
        }
        validator.validateAge(doctor.getAge());
        doctorStore.add(doctor.getId(), doctor);
    }

    public doctor getdoctorById(String id) {
        doctor doctor = doctorStore.get(id);
        if (doctor == null) {
            throw new invalidDataException("Doctor not found with id:" + id);
        }
        return doctor;
    }

    public static List<doctor> getAlldoctor() {
        return (List<doctor>) doctorStore.getAll();
    }

    public void deletedoctor(String id) {
        if (doctorStore.get(id) == null) {
            throw new invalidDataException("Cannot delete. Doctor not found");
        }
        doctorStore.remove(id);
    }

    public doctor searchDoctor(String id) {
        return getdoctorById(id);

    }
    public List<doctor> searchDoctor(String name, boolean byName) {
        return doctorStore.getAll()
                .stream()
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }



}

