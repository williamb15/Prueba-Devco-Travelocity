package co.com.devco.certification.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.travelocity.userinterfaces.CarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ValidateCar implements Question<String> {

    public static ValidateCar inTheTab() {
        return new ValidateCar();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(TAG_AARP_EXCLUSIVE, isEnabled()));
        return Text.of(TAG_AARP_EXCLUSIVE).viewedBy(actor).asString();
    }
}