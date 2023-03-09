package com.fitnessapp.clearfit.main.services;

import com.fitnessapp.clearfit.main.dao.ExerciseDao;
import com.fitnessapp.clearfit.main.enums.WorkOutType;
import com.fitnessapp.clearfit.main.exceptions.ExerciseException;
import com.fitnessapp.clearfit.main.model.Center;
import com.fitnessapp.clearfit.main.model.Exercise;
import com.fitnessapp.clearfit.main.response.ExerciseAvailabilityResponse;

import java.util.List;

public class ExerciseServiceImpl implements ExerciseService {
    private ExerciseDao dao;
    public ExerciseServiceImpl(){
        this.dao=new ExerciseDao();
    }

    @Override
    public boolean isValid(Exercise exercise) {
        return true;
    }

    @Override
    public void addExercises(Exercise exercise) throws ExerciseException {
        dao.addCenterToWorkOutType(exercise.getType(),exercise.getCenter());
    }

    @Override
    public ExerciseAvailabilityResponse getExerciseAvailability(String workOutType) throws ExerciseException {
        List<Center> centers=dao.getExerciseList(workOutType);
        ExerciseAvailabilityResponse response = ExerciseAvailabilityResponse.internalBuilder().exciselist(centers).build();
        return response;
    }

}
