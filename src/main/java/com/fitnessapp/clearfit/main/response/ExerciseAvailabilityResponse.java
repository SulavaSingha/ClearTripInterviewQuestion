package com.fitnessapp.clearfit.main.response;

import com.fitnessapp.clearfit.main.model.Center;
import com.fitnessapp.clearfit.main.model.Exercise;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(builderMethodName = "internalBuilder")
public class ExerciseAvailabilityResponse {
    List<Center> exciselist;
}
