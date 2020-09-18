package com.co.despegar.automation.tasks.main;

import static com.co.despegar.automation.userinterfaces.DespegarPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import com.co.despegar.automation.interactions.ClickOn;
import com.co.despegar.automation.interactions.EnterInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DateDepartureAndReturn implements Task {

    private WebDriver hisBrowser;

    public DateDepartureAndReturn(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }

    public static DateDepartureAndReturn dateFlight(WebDriver hisBrowser){
        return Tasks.instrumented(DateDepartureAndReturn.class, hisBrowser);
    }
}
