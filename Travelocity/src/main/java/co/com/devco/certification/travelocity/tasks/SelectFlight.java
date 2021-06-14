package co.com.devco.certification.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.FlightPage.*;
import static co.com.devco.certification.travelocity.utils.constants.FlightsConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectFlight implements Task {

    private String filter;

    public SelectFlight(String filter) {
        this.filter = filter;
    }

    public static SelectFlight withFilters(String filter) {
        return instrumented(SelectFlight.class, filter);
    }

    @Step("{0} Select Flight")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CHECK_FILTER.of(filter), isEnabled()),
                Click.on(CHECK_FILTER.of(filter)),
                WaitUntil.the(VIEW_FILTER.of(filter), isVisible()),
                Click.on(RESULT_FLIGHT),
                Click.on(BUTTON_CONTINUE),
                WaitUntil.the((RESULT_FLIGHT_RETURN), isVisible()),
                Click.on(RESULT_FLIGHT_RETURN),
                Click.on(BUTTON_CONTINUE),
                Check.whether(VALIDATE_TEXT.of(LABEL_FLYING_TO).resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BUTTON_NO_THANKS)));
    }
}
