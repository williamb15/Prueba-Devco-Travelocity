package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {

    public static final Target MODULE_OPTION = Target.the("Module {0}")
            .locatedBy("//li[@role='presentation']//*[text()='{0}']");

    public static final Target FIELD_START_DATE = Target.the("Field first date d1-btn").located(By.id("d1-btn"));

    public static final Target FIELD_END_DATE = Target.the("Field second date d2-btn").located(By.id("d2-btn"));

    public static final Target BUTTON_NEXT_MONTH = Target.the("Button next month")
            .locatedBy("//*[@aria-labelledby='nextMonth-title']//ancestor::button");

    public static final Target FIELD_DAY = Target.the("Field day")
            .locatedBy("//button[@aria-label='{0}']");

    public static final Target BUTTON_DONE = Target.the("Button done")
            .locatedBy("//span[contains (text(), 'Done')]");

    public static final Target BUTTON_SEARCH = Target.the("Button search")
            .locatedBy("//button[contains (text(), 'Search')]");

    private HomePageElements() {
    }
}
