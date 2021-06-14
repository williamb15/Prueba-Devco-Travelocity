package co.com.devco.certification.travelocitymanual.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_cruise.feature",
    glue = "co.com.devco.certification.travelocitymanual.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class SearchCruiseTestRunner {

}
