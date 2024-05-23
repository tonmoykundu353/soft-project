package com.example.splash_learn;


/**
 * This is the Contestent info Class
 */
public class Contestentinfo {
    String name,email,ContactNo;

    /**
     * This is the parameterized Contestent Info
     * @param name
     * @param email
     * @param ContactNo
     */

    public Contestentinfo(String name, String email, String ContactNo) {
        this.name = name;
        this.email = email;
        this.ContactNo = ContactNo;
    }

    /**
     * This is the Default Constructor
     */

    public Contestentinfo() {

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
    public String getContactNo() {
        return ContactNo;
    }

    /**
     *
     * @param ContactNo
     */
    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
}
