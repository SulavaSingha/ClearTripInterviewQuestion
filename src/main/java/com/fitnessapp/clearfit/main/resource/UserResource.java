package com.fitnessapp.clearfit.main.resource;

import com.fitnessapp.clearfit.main.exceptions.UserException;
import com.fitnessapp.clearfit.main.model.Booking;
import com.fitnessapp.clearfit.main.model.User;
import com.fitnessapp.clearfit.main.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping(value="/v1/fitness-service")
public class UserResource {
    private UserService userService;
    public UserResource(UserService userService){
        this.userService=userService;
    }
    @PostMapping(value="/register/customer")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        if(!userService.isValid(user)){
            return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
        }
        try{
            userService.addUsers(user);
        }catch(UserException exception){
            Logger.getLogger(exception.getMessage(),HttpStatus.CONFLICT.toString());
        }
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);

    }
    @PostMapping(value="/book/slots")
    public ResponseEntity<Booking> bookUser(@RequestBody Booking booking){
        if(!userService.isValid(booking.getEmailId())){
            return new ResponseEntity<Booking>(booking, HttpStatus.BAD_REQUEST);
        }
            if(userService.bookUser(booking)){
                return new ResponseEntity<>(booking,HttpStatus.ACCEPTED);
            }

      return new ResponseEntity<>(booking,HttpStatus.CONFLICT);

    }
    /*@PostMapping(value ="/book/cancel/{emailId}")
    public ResponseEntity<> cancelUser(@PathVariable String emailId){
        userService.cancelBooking(emailId);
    }*/

}
