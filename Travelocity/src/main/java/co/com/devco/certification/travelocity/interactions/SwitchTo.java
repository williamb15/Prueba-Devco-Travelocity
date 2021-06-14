package co.com.devco.certification.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class SwitchTo implements Interaction {

    public static SwitchTo newTab() {
        return Tasks.instrumented(SwitchTo.class);
    }

    @Step("{0} Switch to new tab")
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> windows = new ArrayList<>(
                BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(windows.get(1));
    }
}
