package com.fitnessapp.clearfit.main.services;

import com.fitnessapp.clearfit.main.dao.ExerciseDao;
import com.fitnessapp.clearfit.main.dao.UserDao;
import com.fitnessapp.clearfit.main.exceptions.UserException;
import com.fitnessapp.clearfit.main.model.Booking;
import com.fitnessapp.clearfit.main.model.User;

public class UserServiceImpl implements UserService{
private UserDao userDao;
private ExerciseDao dao;
public UserServiceImpl(){
    this.userDao = new UserDao();
}

    @Override
    public void addUsers(User user) throws UserException {
        userDao.addUsers(user);
    }

    @Override
    public boolean isValid(User user) {
        return false;
    }

    @Override
    public boolean isValid(String emailId) {
        return true;
    }

    @Override
    public boolean bookUser(Booking booking) {
        return dao.bookUsers(booking);
    }

    @Override
    public void cancelBooking(String emailId) {
        //return dao.cancelBooking(emailId);
    }
}
