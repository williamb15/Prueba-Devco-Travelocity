package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SelectDate;
import co.com.devco.certification.travelocity.models.Activity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.*;
import static co.com.devco.certification.travelocity.userinterfaces.SearchActivityPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchActivity implements Task {

    private Activity data;

    public SearchActivity(Activity data) {
        this.data = data;
    }

    public static SearchActivity withOptions(Activity data) {
        return instrumented(SearchActivity.class, data);
    }

    @Step("{0} Search Activity")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIELD_ACTIVITY),
                Enter.theValue(data.getPlace()).into(INPUT_ACTIVITY).thenHit(Keys.ENTER),
                SelectDate.desired(data.getStartDate(), FIELD_START_DATE),
                Click.on(BUTTON_DONE),
                SelectDate.desired(data.getEndDate(), FIELD_END_DATE),
                Click.on(BUTTON_DONE),
                Click.on(BUTTON_SEARCH));
    }
}
