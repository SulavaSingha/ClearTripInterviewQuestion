package com.fitnessapp.clearfit.main.model;

public class Booking {
    private final String emailId;
    private final Seat seat;
    private final String centerName;
    private final String workOutType;

    public Booking(String emailId, Seat seat, String centerName, String workOutType) {
        this.emailId = emailId;
        this.seat = seat;
        this.centerName = centerName;
        this.workOutType = workOutType;
    }

    public String getEmailId() {
        return emailId;
    }

    public Seat getSeat() {
        return seat;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getWorkOutType() {
        return workOutType;
    }
}
