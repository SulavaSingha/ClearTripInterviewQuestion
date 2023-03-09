package com.fitnessapp.clearfit.main.dao;

import com.fitnessapp.clearfit.main.exceptions.UserException;
import com.fitnessapp.clearfit.main.model.Booking;
import com.fitnessapp.clearfit.main.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private Map<String, User> userMap;
    public UserDao(){
        this.userMap = new HashMap<>();
    }

    public void addUsers(User user) throws UserException {
        if(this.userMap.containsKey(user.getEmailId())){
            throw new UserException("User already exists");
        }
        this.userMap.put(user.getEmailId(),user);
    }

    public void bookUsers(Booking booking) {

    }
}
