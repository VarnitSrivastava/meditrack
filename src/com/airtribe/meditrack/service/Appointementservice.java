package com.airtribe.meditrack.service;
import com.airtribe.meditrack.entity.Appointement;
import com.airtribe.meditrack.exception.Appointementnotfoundexception;
import com.airtribe.meditrack.util.datastore;
public class Appointementservice {
    private datastore<Appointement> appointments = new datastore<>();

    public Appointement getAppointment(String id) {
        Appointement appt = appointments.get(id);
        if (appt == null) {
            throw new Appointementnotfoundexception
            ( "Appointment with ID " + id + " does not exist");
        }
        return appt;
    }
}
