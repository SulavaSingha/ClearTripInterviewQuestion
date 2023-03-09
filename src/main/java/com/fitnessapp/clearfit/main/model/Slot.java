package com.fitnessapp.clearfit.main.model;

import com.fitnessapp.clearfit.main.enums.WorkOutType;

public class Slot {
    private final TimeSlot timeSlot;
    private final int numberOfSlot;


    public Slot(TimeSlot timeSlot, int numberOfSlot) {
        this.timeSlot = timeSlot;
        this.numberOfSlot = numberOfSlot;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public int getNumberOfSlot() {
        return numberOfSlot;
    }
}
