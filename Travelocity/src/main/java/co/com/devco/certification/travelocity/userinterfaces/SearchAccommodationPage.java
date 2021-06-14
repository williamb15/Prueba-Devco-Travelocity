package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchAccommodationPage {

    public static final Target DESTINATION_FIELD = Target.the("field destination")
            .locatedBy("//button[@class='uitk-faux-input']");

    public static final Target DESTINATION_INPUT = Target.the("Input destination")
            .locatedBy("//input[@id='location-field-destination']");

    public static final Target FIELD_TRAVELERS = Target.the("Field travelers").located(By.id("adaptive-menu"));

    public static final Target ADD_ANOTHER_ROOM = Target.the("Button add room")
            .locatedBy("//button[contains(text(), 'Add another room')]");

    public static final Target ADD_ADULTS = Target.the("Button add adults")
            .locatedBy("//div[@data-testid='room-2']//*[contains(@aria-labelledby, 'uitk-step-increase-adults')]");

    public static final Target BUTTON_DONE_TRAVELERS = Target.the("Button done")
            .locatedBy("//button[contains (text(), 'Done')]");

    private SearchAccommodationPage (){
    }
}
