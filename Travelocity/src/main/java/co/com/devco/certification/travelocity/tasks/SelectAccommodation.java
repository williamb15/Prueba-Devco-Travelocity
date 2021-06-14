package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SelectInTheList;
import co.com.devco.certification.travelocity.interactions.SwitchTo;
import co.com.devco.certification.travelocity.utils.SearchPrice;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.AccommodationPage.*;
import static co.com.devco.certification.travelocity.utils.constants.FlightsConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectAccommodation implements Task {

    private String zone;
    private String filter;

    public SelectAccommodation(String zone, String filter) {
        this.zone = zone;
        this.filter = filter;
    }

    public static SelectAccommodation withFilters(String zone, String filter) {
        return instrumented(SelectAccommodation.class, zone, filter);
    }

    @Step("{0} Select Accommodation")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ZONE.of(zone)),
                WaitUntil.the(VIEW_FILTER.of(zone), isVisible()),
                SelectInTheList.theOption(SORT_BY, SORT_OPTION.of(filter)),
                WaitUntil.the(VIEW_FILTER.of(LABEL_SORT_BY_ + filter.toLowerCase()), isVisible()));

        WebElementFacade elementHotel = SearchPrice.inTheList(LIST_PRICE_HOTELS.resolveAllFor(actor));
        String priceHotel = elementHotel.getText().replace("$", "").replace(".", "");

        actor.attemptsTo(Click.on(RESULT_HOTEL_RESERVE.of(priceHotel)),
                SwitchTo.newTab());

        WebElementFacade elementRoom = SearchPrice.inTheList(LIST_PRICE_ROOMS.resolveAllFor(actor));
        String priceRoom = elementRoom.getText().replace(" ", "").replace("+", "")
                .replace("$", "").replace(".", "");

        actor.attemptsTo(
                WaitUntil.the(BUTTON_ROOM_RESERVE.of(priceRoom), isEnabled()),
                Click.on(BUTTON_ROOM_RESERVE.of(priceRoom)));
    }
}
