package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchActivityPage {

    public static final Target FIELD_ACTIVITY = Target.the("Field activity")
            .locatedBy("//div[@id='location-field-location-menu']//button[@class='uitk-faux-input']");

    public static final Target INPUT_ACTIVITY = Target.the("Input activity")
            .locatedBy("//input[@id='location-field-location']");

    private SearchActivityPage(){
    }
}
