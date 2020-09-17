package com.co.despegar.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reserve_flight.feature",
        glue = "com.co.despegar.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ReserveFlightRunner {}
