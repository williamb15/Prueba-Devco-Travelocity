package co.com.devco.certification.travelocity.questions;

import co.com.devco.certification.travelocity.interactions.SwitchTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.travelocity.userinterfaces.SearchPackagePage.BUTTON_COMPLETE_BOOKING;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidatePackage implements Question<String> {

    public static ValidatePackage inTheTab() {
        return new ValidatePackage();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                SwitchTo.newTab(),
                WaitUntil.the(BUTTON_COMPLETE_BOOKING, isVisible()));
        return Text.of(BUTTON_COMPLETE_BOOKING).viewedBy(actor).asString();
    }
}