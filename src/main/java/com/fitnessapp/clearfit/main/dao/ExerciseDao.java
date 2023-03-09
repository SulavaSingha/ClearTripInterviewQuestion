package com.fitnessapp.clearfit.main.dao;

import com.fitnessapp.clearfit.main.enums.WorkOutType;
import com.fitnessapp.clearfit.main.exceptions.ExerciseException;
import com.fitnessapp.clearfit.main.model.Booking;
import com.fitnessapp.clearfit.main.model.Center;
import com.fitnessapp.clearfit.main.model.Exercise;

import java.util.*;

public class ExerciseDao {
    private Map<String, List<Center>> centerMap ;
    private Map<String,List<Exercise>> exerciseMap ;
    public ExerciseDao(){
        this.centerMap= new HashMap<>();
        this.exerciseMap= new HashMap<>();
    }

    public void addCenterToWorkOutType(WorkOutType type,Center center) throws ExerciseException {
        if(type==null) throw new ExerciseException("Type is not provided");
        this.centerMap.putIfAbsent(type.toString(),new ArrayList<Center>());
        this.centerMap.get(type.toString()).add(center);

    }

    public List<Center> getExerciseList(String workOutType) throws ExerciseException {
        if(centerMap.get(workOutType)==null){
            throw new ExerciseException("workout not available");
        }
        List<Center> centers = this.centerMap.get(workOutType);
        return centers;
    }

    public boolean bookUsers(Booking booking) {
        Optional<Center> cen= this.centerMap.get(booking.getWorkOutType()).stream().filter(center -> center.getSlot().getTimeSlot().getStart()<booking.getSeat().getSlot().getTimeSlot().getStart()).findFirst();
        return cen!=null;
    }
}
