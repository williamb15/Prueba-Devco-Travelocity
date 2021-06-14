package co.com.devco.certification.travelocity.models;

import java.util.GregorianCalendar;

public class Accommodation {

    private String destination;
    private GregorianCalendar checkin;
    private GregorianCalendar checkout;

    public Accommodation(String destination, GregorianCalendar checkin, GregorianCalendar checkout) {
        this.destination = destination;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getDestination() {
        return destination;
    }

    public GregorianCalendar getCheckin() {
        return checkin;
    }

    public GregorianCalendar getCheckout() {
        return checkout;
    }

}
