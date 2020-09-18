package com.co.despegar.automation.tasks.main;

import static com.co.despegar.automation.userinterfaces.DespegarPage.INP_ORIGIN;
import static com.co.despegar.automation.userinterfaces.DespegarPage.INP_DESTINY;
import static com.co.despegar.automation.userinterfaces.DespegarPage.ITEM_ACTIVE_ORIGIN;
import static com.co.despegar.automation.userinterfaces.DespegarPage.ITEM_ACTIVE_DESTINY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import com.co.despegar.automation.interactions.ClickOn;
import com.co.despegar.automation.interactions.EnterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EnterOriginDestinyFlight implements Task {

    private String strOrigin;
    private String strDestiny;
    private WebDriver hisBrowser;

    public EnterOriginDestinyFlight(String strOrigin, String strDestiny, WebDriver hisBrowser) {
        this.strOrigin = strOrigin;
        this.strDestiny = strDestiny;
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INP_ORIGIN, isVisible()),
                EnterInformation.textField(strOrigin, INP_ORIGIN),
                ClickOn.element(ITEM_ACTIVE_ORIGIN));
        Hit.the(Keys.TAB);
        actor.attemptsTo(
                WaitUntil.the(INP_ORIGIN, isVisible()),
                EnterInformation.textField(strDestiny, INP_DESTINY),
                ClickOn.element(ITEM_ACTIVE_DESTINY));
    }

    public static EnterOriginDestinyFlight enterTextFlight(String strOrigin, String strDestiny, WebDriver hisBrowser){
        return Tasks.instrumented(EnterOriginDestinyFlight.class, strOrigin, strDestiny, hisBrowser);
    }
}
