package com.example.splash_learn;


/**
 * This is UserInfo class
 */
public class UserInfo {
    String user_name, password,college_name,email;


    /**
     *
     * @param user_name
     * @param password
     * @param college_name
     * @param email
     */

    public UserInfo(String user_name, String password, String college_name, String email) {
        this.user_name = user_name;
        this.password = password;
        this.college_name = college_name;
        this.email = email;
    }

    /**
     * Constructor
     */
    public  UserInfo(){}

    /**
     *
     * @return
     */
    public  String getUser_name(){ return  user_name;}

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param user_name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     *
     * @return
     */
    public String getCollege_name() {
        return college_name;
    }

    /**
     *
     * @param college_name
     */
    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
