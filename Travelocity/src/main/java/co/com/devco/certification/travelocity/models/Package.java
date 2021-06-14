package co.com.devco.certification.travelocity.models;

import java.util.GregorianCalendar;

public class Package {
    private boolean hotel;
    private boolean flight;
    private boolean car;
    private String source;
    private String destination;
    private GregorianCalendar departing;
    private GregorianCalendar returning;
    private String flightClass;

    public boolean isHotel() {
        return hotel;
    }

    public boolean isFlight() {
        return flight;
    }

    public boolean isCar() {
        return car;
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
