package com.example.splash_learn;

/**
 * This is the Registration Student Event info class
 */

public class RegStudAtEventInfo {
    String contactNo,email,name;

    /**
     * Parameterized constructor
     * @param contactNo
     * @param email
     * @param name
     */

    public RegStudAtEventInfo(String contactNo, String email, String name) {
        this.contactNo = contactNo;
        this.email = email;
        this.name = name;
    }

    /**
     * This is Default Constructor
     */

    public RegStudAtEventInfo() {

    }

    /**
     *
     * @return
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     *
     * @param contactNo
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
