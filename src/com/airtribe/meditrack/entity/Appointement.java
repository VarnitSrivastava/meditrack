package com.airtribe.meditrack.entity;

import com.airtribe.meditrack.enums.AppointementStatus;

public class Appointement implements Cloneable{
    private String id;
    private doctor doctor;
    private patient patient;
    private AppointementStatus status;

    @Override

    public Appointement clone() {
        Appointement copy = new Appointement();
        copy.id = this.id;
        copy.doctor = this.doctor;
        copy.patient = this.patient;
        copy.status = this.status;
        return copy;
    }
}
