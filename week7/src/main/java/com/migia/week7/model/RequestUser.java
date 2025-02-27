package com.migia.week7.model;


public class RequestUser {


    public RequestUser(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    private String name;
    private String email;

    // Getters and Setters
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser(){
        return new User(name, email);
    }
}
