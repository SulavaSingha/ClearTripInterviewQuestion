package com.fitnessapp.clearfit.main.config;

import com.fitnessapp.clearfit.main.services.UserService;
import com.fitnessapp.clearfit.main.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration {
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}
