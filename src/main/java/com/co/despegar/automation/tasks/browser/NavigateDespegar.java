package com.co.despegar.automation.tasks.browser;

import com.co.despegar.automation.userinterfaces.DespegarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigateDespegar implements Task {

    DespegarPage despegarPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(OpenTheBrowser.openURL(despegarPage));
    }

    public static NavigateDespegar intoHome(){
        return Tasks.instrumented(NavigateDespegar.class);
    }
}
