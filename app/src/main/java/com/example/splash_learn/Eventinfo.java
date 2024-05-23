package com.example.splash_learn;

/**
 * This is EventInfo class
 */

public class Eventinfo {
    String Clubname,EventName,EventPlace,EventRegFees,EventDate,OrganizedBy;

    /**
     *
     * @param clubname
     * @param eventName
     * @param eventPlace
     * @param eventRegFees
     * @param eventDate
     * @param userRoll
     *
     * This is the parameterized Constructor
     */

    public Eventinfo(String clubname, String eventName, String eventPlace, String eventRegFees, String eventDate,String userRoll) {
        Clubname = clubname;
        EventName = eventName;
        EventPlace = eventPlace;
        EventRegFees = eventRegFees;
        EventDate = eventDate;
        OrganizedBy=userRoll;
    }

    /**
     * This is the Default Constructor
     */

    public Eventinfo() {

    }


    /**
     *
     * @return
     */

    public String getClubname() {
        return Clubname;
    }

    /**
     *
     * @param clubname
     */

    public void setClubname(String clubname) {
        Clubname = clubname;
    }

    /**
     *
     * @return
     */
    public String getEventName() {
        return EventName;
    }

    /**
     *
     * @param eventName
     */
    public void setEventName(String eventName) {
        EventName = eventName;
    }

    /**
     *
     * @return
     */
    public String getEventPlace() {
        return EventPlace;
    }

    /**
     *
     * @param eventPlace
     */
    public void setEventPlace(String eventPlace) {
        EventPlace = eventPlace;
    }

    /**
     *
     * @return
     */
    public String getEventRegFees() {
        return EventRegFees;
    }

    /**
     *
     * @param eventRegFees
     */
    public void setEventRegFees(String eventRegFees) {
        EventRegFees = eventRegFees;
    }

    /**
     *
     * @return
     */

    public String getEventDate() {
        return EventDate;
    }

    /**
     *
     * @param eventDate
     */
    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    /**
     *
     * @return
     */
    public String getOrganizedBy() {
        return OrganizedBy;
    }

    /**
     *
     * @param organizedBy
     */
    public void setOrganizedBy(String organizedBy) {
        OrganizedBy = organizedBy;
    }
}
