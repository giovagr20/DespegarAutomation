package com.co.despegar.automation.stepdefinitions;

import com.co.despegar.automation.model.PersonalInformationModel;
import com.co.despegar.automation.model.VouchersInformationModel;
import com.co.despegar.automation.model.WhoTravelModel;
import com.co.despegar.automation.tasks.browser.NavigateDespegar;
import com.co.despegar.automation.tasks.main.ChooseOptionFlight;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ReserveFlightStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor userDespegar = Actor.named("userDespegar");

    @Before
    public void setUp(){
        userDespegar.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User must enter to despegar web page$")
    public void userMustEnterToDespegarWebPage() {
        userDespegar.wasAbleTo(NavigateDespegar.intoHome());
    }

    @Given("^User must choose option vuelos$")
    public void userMustChooseOptionVuelos() {
        userDespegar.attemptsTo(ChooseOptionFlight.chooseOptionFlight(hisBrowser));
    }

    @Given("^User text in origin \"([^\"]*)\" and destiny \"([^\"]*)\"$")
    public void userTextInOriginAndDestiny(String origin, String destiny) {

    }

    @Given("^User adds date departure and return$")
    public void userAddsDateDepartureAndReturn() {

    }

    @Given("^User clicks on Search$")
    public void userClicksOnSearch() {

    }

    @When("^User chooses first flight$")
    public void userChoosesFirstFlight() {

    }

    @When("^User clicks on continue$")
    public void userClicksOnContinue() {
    }

    @Then("^User enters personal information for invoice$")
    public void userEntersPersonalInformationForInvoice(List<PersonalInformationModel> listPersonalInformation) {
    }

    @Then("^User enters information who travel$")
    public void userEntersInformationWhoTravel(List<WhoTravelModel> listWhoTravel) {
    }

    @Then("^User Enters information for vouchers$")
    public void userEntersInformationForVouchers(List<VouchersInformationModel> listVouchersInformation) {
    }

    @Then("^User verifies if  nombre and apellidos are corrects$")
    public void userVerifiesIfNombreAndApellidosAreCorrects() {
    }
}
