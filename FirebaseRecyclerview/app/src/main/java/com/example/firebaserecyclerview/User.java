package com.example.firebaserecyclerview;

public class User {
    private String cover;
    private  String id;
    private  int pw;
    private String  userName;

    public User(){}

    public String getProfile() {
        return cover;
    }

    public void setProfile(String cover) {
        this.cover = cover;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
