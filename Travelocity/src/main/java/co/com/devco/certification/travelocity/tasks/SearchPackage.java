package co.com.devco.certification.travelocity.tasks;

import co.com.devco.certification.travelocity.models.Accommodation;
import co.com.devco.certification.travelocity.models.Flight;
import co.com.devco.certification.travelocity.models.Package;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static co.com.devco.certification.travelocity.userinterfaces.SearchPackagePage.LABELS_PACKAGES;
import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPackage implements Task {

    private Package dataPackage;

    public SearchPackage(Package dataPackage) {
        this.dataPackage = dataPackage;
    }

    public static SearchPackage withOptions(Package dataPackage) {
        return instrumented(SearchPackage.class, dataPackage);
    }

    @Step("{0} Search Package")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Accommodation dataAccommodation = new Accommodation(dataPackage.getDestination(), dataPackage.getDeparting(),
                dataPackage.getReturning());
        Flight dataFlight = new Flight(dataPackage.getSource(), dataPackage.getDestination(), dataPackage.getDeparting(),
                dataPackage.getReturning(), dataPackage.getFlightClass());
        actor.attemptsTo(
                Check.whether(dataPackage.isCar()).andIfSo(
                        Click.on(LABELS_PACKAGES.of(CARS.substring(0, 3).toLowerCase()))),
                Check.whether(!dataPackage.isFlight()).andIfSo(
                        Click.on(LABELS_PACKAGES.of(FLIGHTS.substring(0, 6))),
                        SearchAccommodation.withOptions(dataAccommodation)
                ).otherwise(
                        SearchFlight.withOptions(dataFlight)));
    }
}
