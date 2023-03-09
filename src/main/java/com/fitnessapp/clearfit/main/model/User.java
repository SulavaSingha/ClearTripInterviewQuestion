package com.fitnessapp.clearfit.main.model;

public class User {
    private final String name;
    private final String email_id;
    private final String phonenumber;

    public User(String name, String id, String phonenumber) {
        this.name = name;
        this.email_id = id;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return email_id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
