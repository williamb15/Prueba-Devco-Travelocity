package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCarPage {

    public static final Target FIELD_CAR = Target.the("Field car")
            .locatedBy("//button[@class='uitk-faux-input']//self::button[contains(@aria-label, '{0}')]");

    public static final Target INPUT_PICKUP = Target.the("Input pickup").located(By.id("location-field-locn"));

    public static final Target INPUT_DROP_OFF = Target.the("Input drop off").located(By.id("location-field-loc2"));

    public static final Target FIELD_TIME = Target.the("Field time")
            .locatedBy("//select[@aria-label='{0}']");

    public static final Target FIELD_TIME_OPTION_PICKUP = Target.the("Field time option pick up {0}")
            .locatedBy("//select[@aria-label='Pick-up time']//option[text()='{0}']");

    public static final Target FIELD_TIME_OPTION_DROP_OFF = Target.the("Field time option drop off {0}")
            .locatedBy("//select[@aria-label='Drop-off time']//option[text()='{0}']");

    public static final Target CHECK_MEMBER_AARP = Target.the("Check members").located(By.id("aarp-checkbox-toggle"));

    private SearchCarPage(){
    }
}
