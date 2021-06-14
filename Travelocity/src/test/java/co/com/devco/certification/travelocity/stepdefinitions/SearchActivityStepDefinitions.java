package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.exceptions.SearchActivityException;
import co.com.devco.certification.travelocity.interactions.SelectModule;
import co.com.devco.certification.travelocity.models.Activity;
import co.com.devco.certification.travelocity.questions.ValidateActivity;
import co.com.devco.certification.travelocity.tasks.SearchActivity;
import co.com.devco.certification.travelocity.tasks.SelectActivity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.devco.certification.travelocity.userinterfaces.ActivityPage.*;
import static co.com.devco.certification.travelocity.utils.constants.ErrorsConstants.*;
import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.*;

public class SearchActivityStepDefinitions {

    @Given("^The user is on the travelocity website and enters the search parameters for activity$")
    public void theUserIsOnTheTravelocityWebsiteAndEntersTheSearchParametersForActivity(List<Activity> dataActivity) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectModule.forThe(THINGS_TO_DO),
                SearchActivity.withOptions(dataActivity.get(0)));
    }

    @When("^he is interested in the (.*)$")
    public void heIsInterestedInThePabloEscobarTour(String nameActivity) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectActivity.called(nameActivity));
    }

    @Then("^he will be able to see all the information about the tour$")
    public void heWillBeAbleToSeeAllTheInformationAboutTheTour() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidateActivity.next(VALIDATE_LABEL)).orComplainWith(SearchActivityException.class, ACTIVITY_ERROR));
    }
}
