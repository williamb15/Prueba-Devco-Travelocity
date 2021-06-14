package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SearchAndSelect;
import co.com.devco.certification.travelocity.interactions.SelectDate;
import co.com.devco.certification.travelocity.interactions.SelectInTheList;
import co.com.devco.certification.travelocity.models.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.*;
import static co.com.devco.certification.travelocity.userinterfaces.SearchFlightPage.*;
import static co.com.devco.certification.travelocity.utils.constants.FlightsConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFlight implements Task {

    private Flight data;

    public SearchFlight(Flight data) {
        this.data = data;
    }

    public static SearchFlight withOptions(Flight data) {
        return instrumented(SearchFlight.class, data);
    }

    @Step("{0} Search Flight")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SearchAndSelect.withTheOptions(
                        FIELD_FLIGHT.of(SOURCE), data.getSource(),
                        INPUT_SOURCE, OPTION_SOURCE.of(data.getSource())),
                SearchAndSelect.withTheOptions(
                        FIELD_FLIGHT.of(DESTINATION), data.getDestination(),
                        INPUT_DESTINATION, OPTION_DESTINATION.of(data.getDestination())),
                SelectDate.desired(data.getDeparting(), FIELD_START_DATE),
                Click.on(BUTTON_DONE),
                SelectDate.desired(data.getReturning(), FIELD_END_DATE),
                Click.on(BUTTON_DONE),
                SelectInTheList.theOption(FIELD_CLASS, OPTION_CLASS.of(data.getFlightClass())),
                Click.on(BUTTON_SEARCH));
    }
}
