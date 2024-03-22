package com.group16;

public class Reviewer {
    private String userInfo = "";
    // private database

    public Reviewer(){

    }

    public boolean Validate(String userInfo){
        return true;
    }

    public boolean backToUser(){
        return false;
    }

    public String getUserInfo(){
        return this.userInfo;
    }
}
