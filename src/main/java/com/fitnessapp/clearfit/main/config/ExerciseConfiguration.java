package com.fitnessapp.clearfit.main.config;

import com.fitnessapp.clearfit.main.services.ExerciseService;
import com.fitnessapp.clearfit.main.services.ExerciseServiceImpl;
import com.fitnessapp.clearfit.main.services.UserService;
import com.fitnessapp.clearfit.main.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExerciseConfiguration {
    @Bean
    public ExerciseService exerciseService(){
        return new ExerciseServiceImpl();
    }
}




