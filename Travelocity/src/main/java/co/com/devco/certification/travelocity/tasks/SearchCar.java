package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SelectDate;
import co.com.devco.certification.travelocity.interactions.SelectInTheList;
import co.com.devco.certification.travelocity.models.Car;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.*;
import static co.com.devco.certification.travelocity.userinterfaces.SearchCarPage.*;
import static co.com.devco.certification.travelocity.utils.constants.CarConstants.*;
import static co.com.devco.certification.travelocity.utils.constants.GeneralConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchCar implements Task {

    private Car data;

    public SearchCar(Car data) {
        this.data = data;
    }

    public static SearchCar withOptions(Car data) {
        return instrumented(SearchCar.class, data);
    }

    @Step("{0} Search Car")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIELD_CAR.of(PICK_UP)),
                Enter.theValue(data.getDeliveryPlace()).into(INPUT_PICKUP).thenHit(Keys.ENTER),
                Click.on(FIELD_CAR.of(SAME_AS_PICK_UP)),
                Enter.theValue(data.getReturnPlace()).into(INPUT_DROP_OFF).thenHit(Keys.ENTER),
                SelectDate.desired(data.getPickUpDate(), FIELD_START_DATE),
                Click.on(BUTTON_DONE),
                SelectDate.desired(data.getDropOffDate(), FIELD_END_DATE),
                Click.on(BUTTON_DONE),
                SelectInTheList.theOption(FIELD_TIME.of(PICK_UP+" "+TIME),
                        FIELD_TIME_OPTION_PICKUP.of(data.getPickUpTime())),
                SelectInTheList.theOption(FIELD_TIME.of(DROP_OFF+" "+TIME),
                        FIELD_TIME_OPTION_DROP_OFF.of(data.getDropOffTime())),
                Click.on(CHECK_MEMBER_AARP),
                Click.on(BUTTON_SEARCH));
    }
}
