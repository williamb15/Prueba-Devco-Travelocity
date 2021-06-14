package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchFlightPage {

    public static final Target FIELD_FLIGHT = Target.the("Field flight {0}")
            .locatedBy("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']//self::button[@aria-label='{0}']");

    public static final Target INPUT_SOURCE = Target.the("Input source")
            .locatedBy("//input[@id='location-field-leg1-origin' or @id='location-field-origin']");

    public static final Target INPUT_DESTINATION = Target.the("Input destination")
            .locatedBy("//input[@id='location-field-destination' or @id='location-field-leg1-destination']");

    public static final Target OPTION_SOURCE = Target.the("Option source {0}")
            .locatedBy("//button[@data-stid='location-field-leg1-origin-result-item-button' or @data-stid= 'location-field-origin-result-item-button']//strong[contains(text (), '{0}')]");

    public static final Target OPTION_DESTINATION = Target.the("Option destination {0}")
            .locatedBy("//button[@data-stid='location-field-leg1-destination-result-item-button' or @data-stid='location-field-destination-result-item-button']//strong[contains(text (), '{0}')]");

    public static final Target FIELD_CLASS = Target.the("Field class").located(By.id("preferred-class-input"));

    public static final Target OPTION_CLASS = Target.the("Option class {0}")
            .locatedBy("//div[@id='preferred-class-input']//span[text()='{0}']");

    private SearchFlightPage() {
    }
}
