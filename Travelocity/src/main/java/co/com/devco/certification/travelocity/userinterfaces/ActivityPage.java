package co.com.devco.certification.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActivityPage {

    public static final Target SEARCH_ACTIVITY = Target.the("Field Search")
            .located(By.id("searchKeyword"));

    public static final Target VALIDATE_SORT = Target.the("Validate sort")
            .locatedBy("//select[@id='sort-select']");

    public static final Target LIST_PRICE_ACTIVITY = Target.the("List of prices activity").locatedBy(
            "//span[@class='uitk-lockup-price'][contains(text(), '$')]");

    public static final Target BUTTON_ACTIVITY_RESULT = Target.the("Button activity result").locatedBy(
            "(//span[@class='uitk-lockup-price'][contains(text(), '${0}')]//following::a[@class='uitk-card-link'])[1]");

    public static final Target VALIDATE_LABEL = Target.the("Validate Label").locatedBy(
            "//h1[@class='uitk-heading-4']");

    private ActivityPage() {
    }
}
