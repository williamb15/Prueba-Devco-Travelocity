package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.exceptions.SearchPackageException;
import co.com.devco.certification.travelocity.interactions.SelectModule;
import co.com.devco.certification.travelocity.models.Filter;
import co.com.devco.certification.travelocity.models.Package;
import co.com.devco.certification.travelocity.questions.ValidatePackage;
import co.com.devco.certification.travelocity.tasks.SearchPackage;
import co.com.devco.certification.travelocity.tasks.SelectPackage;
import co.com.devco.certification.travelocity.utils.constants.ErrorsConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.PACKAGES;

public class SearchPackageStepDefinitions {

    @Given("^The user is on the travelocity website and enters the search parameters for package$")
    public void theUserIsOnTheTravelocityWebsiteAndEntersTheSearchParametersForPackage(List<Package> dataPackage) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectModule.forThe(PACKAGES),
                SearchPackage.withOptions(dataPackage.get(0)));
    }

    @When("^he specifies the details of his package$")
    public void heSpecifiesTheDetailsOfHisPackage(List<Filter>dataFilter) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectPackage.withFilters(dataFilter.get(0)));
    }

    @Then("^he will be able to see the package summary and the (.*) button$")
    public void heWillBeAbleToSeeThePackageSummaryAndTheCompleteBookingButton(String nameButton) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePackage.inTheTab(),
                Matchers.containsString(nameButton)).orComplainWith(SearchPackageException.class,
                ErrorsConstants.PACKAGE_ERROR));
    }
}
