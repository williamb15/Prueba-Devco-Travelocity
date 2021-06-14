package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FlightPage {

    public static final Target CHECK_FILTER = Target.the("Check filter")
            .locatedBy("//fieldset//div[@class='uitk-text uitk-type-300']//self::div[contains(text(), '{0}')]//ancestor::div[@class='uitk-switch uitk-checkbox']/input");

    public static final Target VIEW_FILTER = Target.the("View filter {0}")
            .locatedBy("//div[@class='uitk-spacing uitk-spacing-margin-blockend-six']//*[contains(text(), '{0}')]");

    public static final Target RESULT_FLIGHT = Target.the("Result Flight")
            .locatedBy("(//button[@class='uitk-card-link'])[1]");

    public static final Target BUTTON_CONTINUE = Target.the("Button continue")
            .locatedBy("//button[@data-test-id='select-button']");

    public static final Target RESULT_FLIGHT_RETURN = Target.the("Result Flight return")
            .locatedBy("//span[contains(text(), '$0')]//ancestor::button[@class='uitk-card-link']");

    public static final Target BUTTON_NO_THANKS = Target.the("Button no thanks")
            .locatedBy("//a[@data-test-id='forcedChoiceNoThanks']");

    public static final Target BUTTON_CHECKOUT = Target.the("Button checkout")
            .locatedBy("//button[@data-test-id='goto-checkout-button']");

    public static final Target VALIDATE_TEXT = Target.the("Validate label {0}")
            .locatedBy("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']//label[text()='{0}']");

    private FlightPage (){
    }
}
