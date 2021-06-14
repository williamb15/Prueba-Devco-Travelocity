package co.com.devco.certification.travelocitymanual.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static co.com.devco.certification.travelocity.utils.ManualTest.validate;

public class ManualTestDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTestTarvelocity(String step) {
        validate(step, scenario.getName());
    }

}

