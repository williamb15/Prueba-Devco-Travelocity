package co.com.devco.certification.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchAndSelect implements Interaction {

    private Target target;
    private String parameter;
    private Target field;
    private Target option;

    public SearchAndSelect(Target target, String parameter, Target field, Target option) {
        this.target = target;
        this.parameter = parameter;
        this.field = field;
        this.option = option;
    }

    public static SearchAndSelect withTheOptions(Target target, String parameter, Target field, Target option) {
        return Tasks.instrumented(SearchAndSelect.class, target, parameter, field, option);
    }

    @Step("{0} Select, type and search the list for the #parameter")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target),
                Enter.theValue(parameter).into(field),
                WaitUntil.the(option, isVisible()),
                Click.on(option));
    }
}
