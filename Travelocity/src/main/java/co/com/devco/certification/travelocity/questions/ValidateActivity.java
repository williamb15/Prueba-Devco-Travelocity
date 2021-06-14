package co.com.devco.certification.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateActivity implements Question<Boolean> {

    private Target nameActivity;

    public ValidateActivity(Target nameActivity) {
        this.nameActivity = nameActivity;
    }

    public static ValidateActivity next(Target nameActivity) {
        return new ValidateActivity(nameActivity);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(nameActivity).viewedBy(actor).asBoolean();
    }
}
