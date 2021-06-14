package co.com.devco.certification.travelocity.utils.constants;

public class ErrorsConstants {

  public static final String ERROR_YEAR = "The date cannot be earlier than the current one (check year)";
  public static final String ERROR_MONTH = "The date cannot be earlier than the current one (check month)";
  public static final String ERROR_DAY = "The date cannot be earlier than the current one (check day)";
  public static final String ACCOMMODATION_ERROR = "Sorry, it was not possible to find your accommodation";
  public static final String FLIGHT_ERROR = "Sorry, it was not possible to find your flight";
  public static final String CAR_ERROR = "Sorry, it was not possible to find your car";
  public static final String PACKAGE_ERROR = "Sorry, it was not possible to find your package";
  public static final String ACTIVITY_ERROR = "Sorry, it was not possible to find your activity";
  public static final String LIST_PRICE_ERROR = "Sorry, could not get the list\n";

  private ErrorsConstants() {
    throw new IllegalStateException("Utility class");
  }
}
