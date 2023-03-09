package com.fitnessapp.clearfit.main.model;

import com.fitnessapp.clearfit.main.enums.WorkOutType;

public class Exercise {
    private final Center center;
    private final WorkOutType type;

    public Exercise(Center center, WorkOutType type) {
        this.center = center;
        this.type = type;
    }

    public Center getCenter() {
        return center;
    }

    public WorkOutType getType() {
        return type;
    }
}
