package co.com.devco.certification.travelocity.stepdefinitions;

import co.com.devco.certification.travelocity.utils.constants.GeneralConstants;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GeneralStepDefinitions {

    @Managed(driver = GeneralConstants.CHROME)
    private WebDriver hisBrowser;

    @SuppressWarnings("unchecked")
    public void SetUp() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled(GeneralConstants.USER);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(GeneralConstants.URL));
    }

}
