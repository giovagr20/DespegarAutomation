package com.co.despegar.automation.tasks.main;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.co.despegar.automation.userinterfaces.DespegarPage.BTN_SELECT;
import com.co.despegar.automation.interactions.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class FirstFlightSelected implements Task {

    private WebDriver hisBrowser;

    public FirstFlightSelected(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_SELECT, isVisible()),
                Scroll.to(BTN_SELECT).andAlignToTop(),
                ClickOn.element(BTN_SELECT));
    }

    public static FirstFlightSelected chooseFirstFlight(WebDriver hisBrowser){
        return Tasks.instrumented(FirstFlightSelected.class,hisBrowser);
    }
}
