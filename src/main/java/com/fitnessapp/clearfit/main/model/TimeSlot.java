package com.fitnessapp.clearfit.main.model;

public class TimeSlot {
    private final int start;
    private final int end;

    public TimeSlot(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
