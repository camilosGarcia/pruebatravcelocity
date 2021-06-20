package com.travelocity.automation.runners.front;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automated/",
        tags = "@TestCaseReservaVuelo",
        glue = "com.travelocity.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FlightsRunner {
}
