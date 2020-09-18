package com.co.despegar.automation.stepdefinitions;

import com.co.despegar.automation.model.PersonalInformationModel;
import com.co.despegar.automation.model.VouchersInformationModel;
import com.co.despegar.automation.model.WhoTravelModel;
import com.co.despegar.automation.tasks.browser.NavigateDespegar;
import com.co.despegar.automation.tasks.main.*;
import com.co.despegar.automation.tasks.reserve.ReserveFlight;
import com.co.despegar.automation.tasks.reserve.VerifyNameAndLastname;
import com.co.despegar.automation.tasks.reserve.VoucherFlight;
import com.co.despegar.automation.tasks.reserve.WhoTravel;
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
    private String nombre;
    private String apellido;

    @Before
    public void setUp(){
        userDespegar.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
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
        userDespegar.attemptsTo(EnterOriginDestinyFlight.enterTextFlight(
                origin,
                destiny,
                hisBrowser));
    }

    @Given("^User adds date departure and return$")
    public void userAddsDateDepartureAndReturn() {
        userDespegar.attemptsTo(DateDepartureAndReturn.dateFlight(hisBrowser));
    }

    @Given("^User clicks on Search$")
    public void userClicksOnSearch() {
        userDespegar.attemptsTo(SearchFlights.searchFlights(hisBrowser));
    }

    @When("^User chooses first flight$")
    public void userChoosesFirstFlight() {
        userDespegar.attemptsTo(FirstFlightSelected.chooseFirstFlight(hisBrowser));
    }


    @Then("^User enters personal information for invoice$")
    public void userEntersPersonalInformationForInvoice(List<PersonalInformationModel> listPersonalInformation) {
        userDespegar.attemptsTo(ReserveFlight.reserveFlight(
                listPersonalInformation.get(0).getBanco(),
                listPersonalInformation.get(0).getNombre(),
                listPersonalInformation.get(0).getApellido(),
                listPersonalInformation.get(0).getNumeroDocumento(),
                listPersonalInformation.get(0).getEstado(),
                listPersonalInformation.get(0).getCiudad(),
                listPersonalInformation.get(0).getDireccion(),
                hisBrowser));
        nombre = listPersonalInformation.get(0).getNombre();
        apellido = listPersonalInformation.get(0).getApellido();
    }

    @Then("^User enters information who travel$")
    public void userEntersInformationWhoTravel(List<WhoTravelModel> listWhoTravel) {
        userDespegar.attemptsTo(
                WhoTravel.whoTravel(
                listWhoTravel.get(0).getNombres(),
                listWhoTravel.get(0).getApellidos(),
                listWhoTravel.get(0).getPais(),
                listWhoTravel.get(0).getNumeroDocumento(),
                listWhoTravel.get(0).getDia(),
                listWhoTravel.get(0).getMes(),
                listWhoTravel.get(0).getAno(),
                hisBrowser));
    }

    @Then("^User Enters information for vouchers$")
    public void userEntersInformationForVouchers(List<VouchersInformationModel> listVouchersInformation) {
        userDespegar.attemptsTo(VoucherFlight.voucherFlight(
                listVouchersInformation.get(0).getEmail(),
                listVouchersInformation.get(0).getConfirmarEmail(),
                listVouchersInformation.get(0).getArea(),
                listVouchersInformation.get(0).getNumero(),
                hisBrowser));
    }

    @Then("^User verifies if  nombre and apellidos are corrects$")
    public void userVerifiesIfNombreAndApellidosAreCorrects() {
        userDespegar.attemptsTo(VerifyNameAndLastname.verifyNameAndLastname(hisBrowser, nombre, apellido));
    }
}
