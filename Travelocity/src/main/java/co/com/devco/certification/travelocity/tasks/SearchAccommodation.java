package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SelectDate;
import co.com.devco.certification.travelocity.models.Accommodation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.*;
import static co.com.devco.certification.travelocity.userinterfaces.SearchAccommodationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAccommodation implements Task {

    private Accommodation data;

    public SearchAccommodation(Accommodation data) {
        this.data = data;
    }

    public static SearchAccommodation withOptions(Accommodation data) {
        return instrumented(SearchAccommodation.class, data);
    }

    @Step("{0} Search Accommodation")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESTINATION_FIELD),
                Enter.theValue(data.getDestination()).into(DESTINATION_INPUT).thenHit(Keys.ENTER),
                SelectDate.desired(data.getCheckin(), FIELD_START_DATE),
                Click.on(BUTTON_DONE),
                SelectDate.desired(data.getCheckout(), FIELD_END_DATE),
                Click.on(BUTTON_DONE),
                Click.on(FIELD_TRAVELERS),
                Click.on(ADD_ANOTHER_ROOM),
                Click.on(ADD_ADULTS),
                Click.on(BUTTON_DONE_TRAVELERS),
                Click.on(BUTTON_SEARCH));
    }
}
