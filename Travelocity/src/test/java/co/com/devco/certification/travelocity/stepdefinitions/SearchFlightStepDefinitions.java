package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.exceptions.SearchFlightException;
import co.com.devco.certification.travelocity.interactions.SelectModule;
import co.com.devco.certification.travelocity.models.Flight;
import co.com.devco.certification.travelocity.questions.ValidateFlight;
import co.com.devco.certification.travelocity.tasks.SearchFlight;
import co.com.devco.certification.travelocity.tasks.SelectFlight;
import co.com.devco.certification.travelocity.utils.constants.ErrorsConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.FLIGHTS;

public class SearchFlightStepDefinitions {

    @Given("^The user is on the travelocity website and enters the search parameters for flight$")
    public void theUserIsOnTheTravelocityWebsiteAndEntersTheSearchParameters(List<Flight> dataFlight) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectModule.forThe(FLIGHTS),
                SearchFlight.withOptions(dataFlight.get(0)));
    }

    @When("^he enters the search parameters and filter by (.*)$")
    public void heEntersTheSearchParametersAndFilterByStops(String filter) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectFlight.withFilters(filter));
    }

    @Then("^he will be able to see the flight faster and without stops and the (.*) button$")
    public void heWillBeAbleToSeeTheFlightFasterAndWithoutStopsAndTheButton(String nameButton) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateFlight.inTheTab(),
                Matchers.containsString(nameButton)).orComplainWith(SearchFlightException.class,
                ErrorsConstants.FLIGHT_ERROR));
    }
}
