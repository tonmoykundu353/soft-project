package com.example.splash_learn;

/**
 * This is Registration info class
 */

public class RegistrationInfo {
    String Uni_name,Uni_roll,Uni_password;


    /**
     *
     * @param uni_name
     * @param uni_roll
     * @param uni_password
     * This is the constructor
     */

    public RegistrationInfo(String uni_name, String uni_roll, String uni_password) {
        Uni_name = uni_name;
        Uni_roll = uni_roll;
        Uni_password = uni_password;
    }

    /**
     * This is also a constructor
     */
    public RegistrationInfo() {

    }

    /**
     *
     * @return
     */

    public String getUni_name() {
        return Uni_name;
    }

    /**
     *
     * @param uni_name
     */
    public void setUni_name(String uni_name) {
        Uni_name = uni_name;
    }

    /**
     *
     * @return
     */
    public String getUni_roll() {
        return Uni_roll;
    }

    /**
     *
     * @param uni_roll
     */
    public void setUni_roll(String uni_roll) {
        Uni_roll = uni_roll;
    }

    /**
     *
     * @return
     */
    public String getUni_password() {
        return Uni_password;
    }

    /**
     *
     * @param uni_password
     */
    public void setUni_password(String uni_password) {
        Uni_password = uni_password;
    }
}
