package co.com.devco.certification.travelocity.models;

import java.util.GregorianCalendar;

public class Activity {

    private String place;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public String getPlace() {
        return place;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }
}
