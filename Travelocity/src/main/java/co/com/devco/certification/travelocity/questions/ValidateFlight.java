package co.com.devco.certification.travelocity.questions;

import co.com.devco.certification.travelocity.interactions.SwitchTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.travelocity.userinterfaces.FlightPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateFlight implements Question<String> {

    public static ValidateFlight inTheTab() {
        return new ValidateFlight();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                SwitchTo.newTab(),
                WaitUntil.the(BUTTON_CHECKOUT, isVisible()));
        return Text.of(BUTTON_CHECKOUT).viewedBy(actor).asString();
    }
}
