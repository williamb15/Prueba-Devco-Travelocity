package co.com.devco.certification.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.MODULE_OPTION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectModule implements Interaction {

    private String module;

    public SelectModule(String module) {
        this.module = module;
    }

    public static SelectModule forThe(String module) {
        return Tasks.instrumented(SelectModule.class, module);
    }

    @Step("{0} Select the modulo of #module")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MODULE_OPTION.of(module), isVisible()),
                Click.on(MODULE_OPTION.of(module)));
    }
}
