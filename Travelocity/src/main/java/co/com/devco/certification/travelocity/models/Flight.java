package co.com.devco.certification.travelocity.models;

import java.util.GregorianCalendar;

public class Flight {

    private String source;
    private String destination;
    private GregorianCalendar departing;
    private GregorianCalendar returning;
    private String flightClass;

    public Flight(String source, String destination, GregorianCalendar departing, GregorianCalendar returning, String flightClass) {
        this.source = source;
        this.destination = destination;
        this.departing = departing;
        this.returning = returning;
        this.flightClass = flightClass;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public GregorianCalendar getDeparting() {
        return departing;
    }

    public GregorianCalendar getReturning() {
        return returning;
    }

    public String getFlightClass() {
        return flightClass;
    }
}
