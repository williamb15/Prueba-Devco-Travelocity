package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.exceptions.SearchAccommodationException;
import co.com.devco.certification.travelocity.interactions.SelectModule;
import co.com.devco.certification.travelocity.models.Accommodation;
import co.com.devco.certification.travelocity.questions.ValidateHotel;
import co.com.devco.certification.travelocity.tasks.SearchAccommodation;
import co.com.devco.certification.travelocity.tasks.SelectAccommodation;
import co.com.devco.certification.travelocity.utils.constants.ErrorsConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.*;

public class SearchAccommodationStepDefinitions extends GeneralStepDefinitions {

    @Before
    public void config() {
        SetUp();
    }

    @Given("^The user is on the travelocity website and enters the search parameters for accommodation$")
    public void theUserIsOnTheTravelocityWebsiteAndEntersTheSearchParametersForAccommodation(List<Accommodation> dataAccommodation) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectModule.forThe(STAYS),
                SearchAccommodation.withOptions(dataAccommodation.get(0)));
    }

    @When("^he enters filters by (.*) and (.*)$")
    public void heEntersFiltersByAnd(String zone, String filter) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectAccommodation.withFilters(zone, filter));
    }

    @Then("^he will be able to see the summary of the query and (.*)$")
    public void heWillBeAbleToSeeTheSummaryOfTheQueryAnd(String label) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateHotel.inTheSummary(),
                Matchers.containsString(label)).orComplainWith(SearchAccommodationException.class,
                ErrorsConstants.ACCOMMODATION_ERROR));
    }
}
