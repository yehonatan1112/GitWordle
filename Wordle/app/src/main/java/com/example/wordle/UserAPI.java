package com.example.wordle;

public class UserAPI {

    private String userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // constructor
    public UserAPI(String userId,String userEmail,String userFirstName,String userLastName,String userPassword)
    {
        this.userEmail=userEmail;
        this.userId=userId;
        this.userFirstName=userFirstName;
        this.userLastName=userLastName;
        this.userPassword=userPassword;
    }
}
