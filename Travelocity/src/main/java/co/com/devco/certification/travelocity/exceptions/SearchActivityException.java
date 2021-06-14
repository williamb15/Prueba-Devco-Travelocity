package co.com.devco.certification.travelocity.exceptions;

@SuppressWarnings("serial")
public class SearchActivityException extends AssertionError {

    public SearchActivityException(String message, Throwable cause) {
        super(message, cause);
    }
}
