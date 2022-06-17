package com.example.firebaserecyclerview;

public class User {
    private String cover;                                                                           // profile image
    private  String id;                                                                             // User Id
    private  int pw;                                                                                // User Password
    private String  userName;                                                                       // UserName

    public User(){}                                                                                 // User

    public String getCover() {                                                                      // getCover
        return cover;
    }

    public void setCover(String cover) {                                                            // setCover
        this.cover = cover;
    }

    public String getId() {                                                                         // getId
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {                                                                            // getPassWord
        return pw;
    }

    public void setPw(int pw) {                                                                     // setPassWord
        this.pw = pw;
    }

    public String getUserName() {                                                                   // getUserName
        return userName;
    }

    public void setUserName(String userName) {                                                      // setUserName
        this.userName = userName;
    }
}
