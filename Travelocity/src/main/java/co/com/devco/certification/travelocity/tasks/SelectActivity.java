package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SwitchTo;
import co.com.devco.certification.travelocity.utils.SearchPrice;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.travelocity.userinterfaces.ActivityPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectActivity implements Task {

    private String nameActivity;

    public SelectActivity(String nameActivity) {
        this.nameActivity = nameActivity;
    }

    public static SelectActivity called(String nameActivity) {
        return instrumented(SelectActivity.class,nameActivity);
    }

    @Step("{0} Select Activity")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nameActivity).into(SEARCH_ACTIVITY).thenHit(Keys.ENTER),
                WaitUntil.the(VALIDATE_SORT, isEnabled()));

        WebElementFacade element = SearchPrice.inTheList(LIST_PRICE_ACTIVITY.resolveAllFor(actor));
        String price = element.getText().replace("$", "").replace(".", "");
        actor.attemptsTo(
                Click.on(BUTTON_ACTIVITY_RESULT.of(price)),
                SwitchTo.newTab());
    }
}
