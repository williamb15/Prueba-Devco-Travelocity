package co.com.devco.certification.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.travelocity.userinterfaces.AccommodationPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateHotel implements Question<String> {

    public static ValidateHotel inTheSummary() {
        return new ValidateHotel();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_PRICE_DETAILS, isVisible()));
        return Text.of(LABEL_PRICE_DETAILS).viewedBy(actor).asString();
    }
}
