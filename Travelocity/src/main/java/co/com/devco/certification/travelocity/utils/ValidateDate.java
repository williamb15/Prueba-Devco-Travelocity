package co.com.devco.certification.travelocity.utils;

import co.com.devco.certification.travelocity.utils.constants.ErrorsConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static co.com.devco.certification.travelocity.utils.constants.GeneralConstants.FORMAT_DATE;

public class ValidateDate {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidateDate.class);
    private static GregorianCalendar currentDate = new GregorianCalendar();
    private static int currentYear = currentDate.get(Calendar.YEAR);
    private static int currentMonth = currentDate.get(Calendar.MONTH);
    private static int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
    private static boolean dateOK;

    private ValidateDate() {
    }

    public static ValidateDate correct(GregorianCalendar date) {

        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day = date.get(Calendar.DAY_OF_MONTH);

        if (currentYear > year) {
            LOGGER.info(ErrorsConstants.ERROR_YEAR);
            dateOK = false;
        } else {
            dateOK = true;
        }
        if (currentYear == year && currentMonth > month) {
            LOGGER.info(ErrorsConstants.ERROR_MONTH);
            dateOK = false;
        } else {
            dateOK = true;
        }
        if (currentMonth == month && currentDay > day) {
            LOGGER.info(ErrorsConstants.ERROR_DAY);
            dateOK = false;
        } else {
            dateOK = true;
        }
        return new ValidateDate();
    }

    public static boolean isDateOK() {
        return dateOK;
    }

    public static String formatDate(GregorianCalendar date) {
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE);
        String formattedDate = formatter.format(date.getTime());
        formattedDate = formattedDate.substring(0, 1).toUpperCase() + formattedDate.substring(1);

        if (formattedDate.substring(4, 5).equals("0")) {
            formattedDate = formattedDate.substring(0, 4) + formattedDate.substring(5, 12);
            return formattedDate;
        }else{
            return formattedDate;
        }
    }
}
