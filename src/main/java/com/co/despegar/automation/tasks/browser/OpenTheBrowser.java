package com.co.despegar.automation.tasks.browser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

    private PageObject pageObject;

    public OpenTheBrowser(PageObject pageObject) {
        this.pageObject = pageObject;
    }

    @Override
    public <T extends Actor> void performAs(T actor) { actor.wasAbleTo(Open.browserOn(pageObject)); }

    public static OpenTheBrowser openURL(PageObject pageObject){
        return Tasks.instrumented(OpenTheBrowser.class, pageObject);
    }
}
