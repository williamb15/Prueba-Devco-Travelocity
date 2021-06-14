package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPackagePage {

    public static final Target LABELS_PACKAGES = Target.the("Label packages {0}")
            .locatedBy("//span[@class='uitk-pill-text']//self::span[contains(text(),'{0}')]");

    public static final Target VALIDATE_PACKAGE = Target.the("Label packages {0}")
            .locatedBy("//label[@class='uitk-field-label']//span[text()='{0}']");

    public static final Target BUTTON_COMPLETE_BOOKING = Target.the("Button complete booking")
            .located(By.id("complete-booking"));

    private SearchPackagePage(){
    }
}
