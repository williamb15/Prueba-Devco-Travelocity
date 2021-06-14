package co.com.devco.certification.travelocity.models;

import java.util.GregorianCalendar;

public class Car {

    private String deliveryPlace;
    private String returnPlace;
    private GregorianCalendar pickUpDate;
    private GregorianCalendar dropOffDate;
    private String pickUpTime;
    private String dropOffTime;

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public String getReturnPlace() {
        return returnPlace;
    }

    public GregorianCalendar getPickUpDate() {
        return pickUpDate;
    }

    public GregorianCalendar getDropOffDate() {
        return dropOffDate;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }
}
