package co.com.devco.certification.travelocity.interactions;

import co.com.devco.certification.travelocity.utils.ValidateDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static co.com.devco.certification.travelocity.userinterfaces.HomePageElements.*;
import static co.com.devco.certification.travelocity.utils.constants.GeneralConstants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectDate implements Interaction {

    private Calendar currentDate = new GregorianCalendar();
    private GregorianCalendar desiredDate;
    private Target target;

    public SelectDate(GregorianCalendar desiredDate, Target target) {
        this.desiredDate = desiredDate;
        this.target = target;
    }

    public static SelectDate desired(GregorianCalendar desiredDate, Target target) {
        return Tasks.instrumented(SelectDate.class, desiredDate, target);
    }

    @Step("{0} Select the desired date")
    @Override
    public <T extends Actor> void performAs(T actor) {
        int currentMonth;
        int month;
        int clicks;

        ValidateDate.correct(desiredDate);
        String formattedDate = ValidateDate.formatDate(desiredDate);

        if (target.toString().contains(FIELD_DATE_NAME)) {
            currentMonth = (currentDate.get(Calendar.MONTH)) + 1;
            month = (desiredDate.get(Calendar.MONTH)) + 1;
            actor.attemptsTo(
                    WaitUntil.the(target, isEnabled()),
                    Click.on(target));
            if (ValidateDate.isDateOK()) {
                if (currentMonth < month) {
                    clicks = month - currentMonth;
                    for (int i = 0; i < clicks; i++) {
                        actor.attemptsTo(
                                Click.on(BUTTON_NEXT_MONTH));
                    }
                }
                actor.attemptsTo(
                        WaitUntil.the(FIELD_DAY.of(formattedDate), isEnabled()),
                        Click.on(FIELD_DAY.of(formattedDate)));
            }
        } else {
            actor.attemptsTo(
                    Click.on(target),
                    Click.on(FIELD_DAY.of(formattedDate)));
        }
    }
}
