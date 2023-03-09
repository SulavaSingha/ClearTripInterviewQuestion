package com.fitnessapp.clearfit.main.services;

import com.fitnessapp.clearfit.main.exceptions.UserException;
import com.fitnessapp.clearfit.main.model.Booking;
import com.fitnessapp.clearfit.main.model.User;

public interface UserService {
    void addUsers(User user) throws UserException;

    boolean isValid(User user);

    boolean isValid(String emailId);

    boolean bookUser(Booking booking);

    void cancelBooking(String emailId);
}
