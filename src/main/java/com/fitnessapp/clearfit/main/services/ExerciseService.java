package com.fitnessapp.clearfit.main.services;

import com.fitnessapp.clearfit.main.enums.WorkOutType;
import com.fitnessapp.clearfit.main.exceptions.ExerciseException;
import com.fitnessapp.clearfit.main.model.Exercise;
import com.fitnessapp.clearfit.main.response.ExerciseAvailabilityResponse;

public interface ExerciseService {
     boolean isValid(Exercise exercise) ;

    void addExercises(Exercise exercise) throws ExerciseException;

    ExerciseAvailabilityResponse getExerciseAvailability(String workOutType) throws ExerciseException;
}
