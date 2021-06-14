package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.interactions.SelectInTheList;
import co.com.devco.certification.travelocity.interactions.SwitchTo;
import co.com.devco.certification.travelocity.utils.SearchPrice;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.CarPage.*;
import static co.com.devco.certification.travelocity.userinterfaces.SearchPackagePage.VALIDATE_PACKAGE;
import static co.com.devco.certification.travelocity.utils.constants.CarConstants.*;
import static co.com.devco.certification.travelocity.utils.constants.GeneralConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SelectCar implements Task {

    private int persons;
    private String offer;

    public SelectCar(int persons, String offer) {
        this.persons = persons;
        this.offer = offer;
    }

    public static SelectCar withFilters(int persons, String specialPrice) {
        return instrumented(SelectCar.class, persons, specialPrice);
    }

    @Step("{0} Select Car")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(persons >= 6).andIfSo(
                        WaitUntil.the(CHECK_FILTER.of(SIX_OR_MORE_PASSENGERS), isEnabled()),
                        Click.on(CHECK_FILTER.of(SIX_OR_MORE_PASSENGERS)),
                        WaitUntil.the(VIEW_FILTER.of(SIX_OR_MORE_PASSENGERS), isVisible()))
                        .otherwise(
                                WaitUntil.the(CHECK_FILTER.of(TWO_OR_FIVE_PASSENGERS), isEnabled()),
                                Click.on(CHECK_FILTER.of(TWO_OR_FIVE_PASSENGERS)),
                                WaitUntil.the(VIEW_FILTER.of(TWO_OR_FIVE_PASSENGERS), isVisible())),
                Check.whether(offer.equals(SPECIAL_PRICE)).andIfSo(
                        SelectInTheList.theOption(SORT_CAR_SELECT, SORT_CAR_OPTION.of(AARP_MEMBER_EXCLUSIVE)),
                        WaitUntil.the(VIEW_FILTER.of(SORT_BY_AARP_MEMBER), isVisible()),
                        Click.on(CHECK_FILTER.of(AARP_MEMBER_EXCLUSIVE)),
                        WaitUntil.the(VIEW_FILTER.of(AARP_MEMBER_EXCLUSIVE), isVisible())));
        if (VALIDATE_PACKAGE.of(PICK_UP + " " + DATE).resolveFor(actor).isVisible()) {
            WebElementFacade element = SearchPrice.inTheList(LIST_PRICE_CAR.resolveAllFor(actor));
            String price = element.getText().replace(" ", "").replace("$", "").
                    replace(".", "");
            actor.attemptsTo(
                    WaitUntil.the(BUTTON_CAR_RESERVE.of(price), isEnabled()),
                    Click.on(BUTTON_CAR_RESERVE.of(price)),
                    SwitchTo.newTab());
        }else {
            WebElementFacade elementPackage = SearchPrice.inTheList(LIST_PRICE_CAR_PACKAGE.resolveAllFor(actor));
            String pricePackage = elementPackage.getText().replace("+", "").
                    replace("$", "").replace(".", "");
            actor.attemptsTo(
                    WaitUntil.the(BUTTON_CAR_RESERVE_PACKAGE.of(pricePackage), isEnabled()),
                    Click.on(BUTTON_CAR_RESERVE_PACKAGE.of(pricePackage)));
        }
    }
}
