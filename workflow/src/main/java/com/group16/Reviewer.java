package com.group16;

public class Reviewer {
    private String userInfo = "";
    // private database

    public Reviewer(){

    }

    //  validates user info
    // returns true if valid else returns false
    // hardcoded for testing
    public boolean Validate(String userInfo){
        return true;
    }

    // returns back to user if true, false if there was an error
    // hard coded return value for testing
    public boolean backToUser(){
        return false;
    }

    // gets the user info
    public String getUserInfo(){
        return this.userInfo;
    }

    // sets the user info
    public void setUserInfo(String userInfo) { this.userInfo = userInfo; }
}
