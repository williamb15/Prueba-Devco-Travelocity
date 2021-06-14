package co.com.devco.certification.travelocity.exceptions;

@SuppressWarnings("serial")
public class SearchFlightException extends AssertionError {

    public SearchFlightException(String message, Throwable cause) {
        super(message, cause);
    }
}
