package co.com.devco.certification.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_activity.feature",
        glue = "co.com.devco.certification.travelocity.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SearchActivityRunner {
}
