package com.co.despegar.automation.tasks.main;
import static com.co.despegar.automation.userinterfaces.DespegarPage.BTN_FLIGHTS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import com.co.despegar.automation.interactions.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class ChooseOptionFlight implements Task {

    private WebDriver hisBrowser;

    public ChooseOptionFlight(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_FLIGHTS, isVisible()),
                ClickOn.element(BTN_FLIGHTS));
    }

    public static ChooseOptionFlight chooseOptionFlight(WebDriver hisBrowser){
        return Tasks.instrumented(ChooseOptionFlight.class, hisBrowser);
    }
}
