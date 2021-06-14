package co.com.devco.certification.travelocity.exceptions;

@SuppressWarnings("serial")
public class SearchCarException extends AssertionError {

    public SearchCarException(String message, Throwable cause) {
        super(message, cause);
    }
}
