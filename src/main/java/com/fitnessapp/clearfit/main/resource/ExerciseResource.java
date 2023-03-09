package com.fitnessapp.clearfit.main.resource;

import com.fitnessapp.clearfit.main.enums.WorkOutType;
import com.fitnessapp.clearfit.main.exceptions.ExerciseException;
import com.fitnessapp.clearfit.main.exceptions.UserException;
import com.fitnessapp.clearfit.main.model.Center;
import com.fitnessapp.clearfit.main.model.Exercise;
import com.fitnessapp.clearfit.main.model.User;
import com.fitnessapp.clearfit.main.response.ExerciseAvailabilityResponse;
import com.fitnessapp.clearfit.main.services.ExerciseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;
@RestController
@RequestMapping(value="/v1/fitness-service")
public class ExerciseResource {
    private ExerciseService exerciseService;
    public ExerciseResource(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }
    @PostMapping(value="/register/workOuts")
    public ResponseEntity<Exercise> registerUser(@RequestBody Exercise exercise){
        if(!exerciseService.isValid(exercise)){
            return new ResponseEntity<Exercise>(exercise, HttpStatus.BAD_REQUEST);
        }
        try{
            exerciseService.addExercises(exercise);
        }catch(ExerciseException exception){
            Logger.getLogger(exception.getMessage(),HttpStatus.CONFLICT.toString());
        }
        return new ResponseEntity<>(exercise,HttpStatus.ACCEPTED);

    }
    @RequestMapping(value="/workOuts/availability/{workOutType}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ExerciseAvailabilityResponse> registerUser(@PathVariable String workOutType){
        ExerciseAvailabilityResponse response=null;
        try{
            response=exerciseService.getExerciseAvailability(workOutType);
        }catch(ExerciseException exception){
            Logger.getLogger(exception.getMessage(),HttpStatus.CONFLICT.toString());
        }
        return new ResponseEntity<ExerciseAvailabilityResponse>(response,HttpStatus.OK);
/**
 * Curl
 * curl --location --request GET 'http://localhost:8081/v1/fitness-service/workOuts/availability/CARDIO' \
 * --header 'Content-Type: application/json' \
 * --data-raw ''
 * response
 * {
 *     "exciselist": [
 *         {
 *             "location": "kormangla",
 *             "slot": {
 *                 "timeSlot": {
 *                     "start": 6,
 *                     "end": 7
 *                 },
 *                 "numberOfSlot": 100
 *             },
 *             "type": "WEIGHTS"
 *         }
 *     ]
 * }
 *
 * Returned two lists - Cardio
 *
 * {
 *     "exciselist": [
 *         {
 *             "location": "Bellandur",
 *             "slot": {
 *                 "timeSlot": {
 *                     "start": 18,
 *                     "end": 19
 *                 },
 *                 "numberOfSlot": 100
 *             },
 *             "type": "CARDIO"
 *         },
 *         {
 *             "location": "kormangla",
 *             "slot": {
 *                 "timeSlot": {
 *                     "start": 8,
 *                     "end": 9
 *                 },
 *                 "numberOfSlot": 200
 *             },
 *             "type": "CARDIO"
 *         }
 *     ]
 * }
 */
    }

}
