package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.models.Filter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.SearchPackagePage.VALIDATE_PACKAGE;
import static co.com.devco.certification.travelocity.utils.constants.AccommodationConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPackage implements Task {

    private Filter dataFilter;

    public SelectPackage(Filter dataFilter) {
        this.dataFilter = dataFilter;
    }

    public static SelectPackage withFilters(Filter dataFilter) {
        return instrumented(SelectPackage.class, dataFilter);
    }

    @Step("{0} Select Package")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(VALIDATE_PACKAGE.of(CHECK_IN).resolveFor(actor).isVisible()).andIfSo(
                        SelectAccommodation.withFilters(dataFilter.getZone(),dataFilter.getFilterAccommodation()),
                        SelectCar.withFilters(dataFilter.getCapacityCar(),dataFilter.getMemberAARP())
                ).otherwise(
                SelectAccommodation.withFilters(dataFilter.getZone(),dataFilter.getFilterAccommodation()),
                SelectFlight.withFilters(dataFilter.getStops()),
                SelectCar.withFilters(dataFilter.getCapacityCar(),dataFilter.getMemberAARP())));
    }
}
