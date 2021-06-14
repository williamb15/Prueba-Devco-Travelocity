package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.exceptions.SearchCarException;
import co.com.devco.certification.travelocity.interactions.SelectModule;
import co.com.devco.certification.travelocity.models.Car;
import co.com.devco.certification.travelocity.questions.ValidateCar;
import co.com.devco.certification.travelocity.tasks.SearchCar;
import co.com.devco.certification.travelocity.tasks.SelectCar;
import co.com.devco.certification.travelocity.utils.constants.ErrorsConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.devco.certification.travelocity.utils.constants.ProductConstants.CARS;

public class SearchCarStepDefinitions {

    @Given("^The user is on the travelocity website and enters the search parameters for car$")
    public void theUserIsOnTheTravelocityWebsiteAndEntersTheSearchParametersForCar(List<Car> dataCar) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                SelectModule.forThe(CARS),
                SearchCar.withOptions(dataCar.get(0)));
    }

    @When("^he specifies that he needs a car for (.*) people with a (.*)$")
    public void heSpecifiesThatHeNeedsACarFor6PeopleWithASpecialPrice(int persons, String specialPrice) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectCar.withFilters(persons, specialPrice));
    }

    @Then("^he will be able to see the cart information with the member tag (.*)$")
    public void heWillBeAbleToSeeTheCartInformationWithTheMemberTag(String nameTag) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCar.inTheTab(),
                Matchers.equalTo(nameTag)).orComplainWith(SearchCarException.class,
                ErrorsConstants.CAR_ERROR));
    }
}
