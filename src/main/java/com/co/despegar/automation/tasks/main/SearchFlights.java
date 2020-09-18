package com.co.despegar.automation.tasks.main;

import static com.co.despegar.automation.userinterfaces.DespegarPage.BTN_SEARCH;

import com.co.despegar.automation.interactions.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class SearchFlights implements Task {
    private WebDriver hisBrowser;

    public SearchFlights(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        hisBrowser.navigate().to("https://www.despegar.com.co/shop/flights/results/roundtrip/MDE/BOG/2020-11-01/2020-11-08/1/0/0/NA/NA/NA/NA/NA/?from=SB&di=1-0");
    }

    public static SearchFlights searchFlights(WebDriver hisBrowser){
        return Tasks.instrumented(SearchFlights.class,hisBrowser);
    }
}
