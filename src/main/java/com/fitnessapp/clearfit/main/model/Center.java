package com.fitnessapp.clearfit.main.model;

import com.fitnessapp.clearfit.main.enums.WorkOutType;

public class Center {
    private final String location;
    private final Slot slot;
    private final WorkOutType type;

    public Center(String location, Slot slot, WorkOutType type) {
        this.location = location;
        this.slot = slot;
        this.type = type;
    }


    public String getLocation() {
        return location;
    }

    public Slot getSlot() {
        return slot;
    }

    public WorkOutType getType() {
        return type;
    }
}
